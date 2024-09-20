<?php

$conteudo2;
$conteudo;

if (isset($_GET['comando'])) {
    $comando = rawurlencode($_GET['comando']);
    
    $conteudo = file_get_contents("http://localhost:4567/{$comando}");
  
}
else {
    echo "comando de ajuda";
    $conteudo = file_get_contents("http://localhost:4567/help");
}


$arrayAssociativo = json_decode($conteudo);



include "template.phtml";