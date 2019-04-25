<?php
    define("PAGE_SIZE", 10);
    $start = 0;
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
            <a href="squares.php">Previous Page</a> |
        <?php } ?>
        <a href="squares.php">Next Page</a>
        </p>

    </body>
</html>