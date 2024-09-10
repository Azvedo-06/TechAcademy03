<?php

    $conteudo = file_get_contents("http://localhost:4567");
    $arrayGame = json_decode($conteudo);

    include "template.phtml";