# Este desafio busca fazer um processo de mineração usando SHA256. 

A tarefa é pegar o seu nome (somente o primeiro), anexar um número (convertido para string) e calcular a função resumo desta string.

O resultado da função resumo buscado  deve ter pelo menos 30 bits 0 na frente.

Exemplo:

Nome: Avelino Francisco Zorzo

Número encontrado: 194217463

String: Avelino194217463

SHA256 (em hexa): 000000030BC26B9F5732EEFA3D2A6136D30C6C0332E15E6580B82AC0A70781B6

SHA256 (em binário): 0000 0000 0000 0000 0000 0000 0000 0011 0000 1011 ....

Para conferir, pode usar o site: https://passwordsgenerator.net/sha256-hash-generator/



Resposta deve ser o nome concatenado com o número encontrado.