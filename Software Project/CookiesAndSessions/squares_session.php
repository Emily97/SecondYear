<?php
    define("PAGE_SIZE", 10);
    if (isset($_GET['direction'])) {
        $direction = $_GET['direction'];
    }
    else {
        $direction = 'next';
    }
    session_start();
    if (isset($_SESSION['start'])) {
        if ($direction === 'next') {
            $start = $_SESSION['start'] + 10;
        }
        else if ($direction === 'prev') {
            $start = $_SESSION['start'] - 10;
        }
    }
    else {
        $start = 0;
    }
    $_SESSION['start'] = $start;
    
    $end = $start + PAGE_SIZE - 1;
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Number squaring</title>
        <style>
            th { vertical-align: bottom; }
            th, td { padding: 0.4em; }
        </style>
    </head>
    <body>
        <h2>Number squaring</h2>

        <p>Displaying the squares of the numbers <?php echo $start ?> to <?php echo $end ?>:</p>

        <table>
            <tr>
                <th>n</th>
                <th>n<sup>2</sup></th>
            </tr>
            <?php for ($i = $start; $i <= $end; $i++) { ?>
                <tr>
                    <td><?php echo $i ?></td>
                    <td><?php echo pow($i, 2) ?></td>
                </tr>
            <?php } ?>
        </table>

        <p>
        <?php if ($start > 0) { ?>
            <?php 
            if ($start - PAGE_SIZE <= 0) { 
                $prev = 0;
            } 
            else {
                $prev = $start - PAGE_SIZE;
            }
            ?>
            <a href="squares_session.php?direction=prev">Previous Page</a> |
        <?php } ?>
        <a href="squares_session.php?direction=next">Next Page</a>
        </p>

    </body>
</html>