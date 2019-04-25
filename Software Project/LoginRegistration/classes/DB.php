<?php
class DB {

    private static $host = "daneel";
    private static $database = "john";
    private static $username = "john";
    private static $password = "secret";

    public static function getInstance() {
        $dsn = 'mysql:host=' . DB::$host . ';dbname=' . DB::$database;

        $connection = new PDO($dsn, DB::$username, DB::$password);
        $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        return $connection;
    }

}