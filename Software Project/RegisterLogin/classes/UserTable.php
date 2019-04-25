<?php

class UserTable {
    private $link;
    
    public function __construct($connection) {
        $this->link = $connection;
    }

    public function insert($username, password, $role) {
        $sql = "INSERT INTO users(username, password, role) "
             . "VALUES (:username, :password, :role)";

        $params = array(
            'username' => $username,
            'password' => $password,
            'role' => $role
        );
        $stmt = $this->link->prepare($sql);
        $status = $stmt->execute($params);
        if ($status != true) {
            $errorInfo = $stmt->errorInfo();
            throw new Exception("Could not save user: " . $errorInfo[2]);
        }

        $id = $this->link->lastInsertId('users');
        
        return $id;
    }
	
    public function getUserByUsername($username) {
        $sql = "SELECT * FROM users WHERE username = :username";
        $params = array('username' => $username);
        $stmt = $this->link->prepare($sql);
        $status = $stmt->execute($params);
        if ($status != true) {
            $errorInfo = $stmt->errorInfo();
            throw new Exception("Could not retrieve user: " . $errorInfo[2]);
        }

        $user = null;
        if ($stmt->rowCount() == 1) {
            $row = $stmt->fetch();
        }
        return $row;
    }

}

?>
