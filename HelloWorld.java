package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa Annotation indica Classe 'Controller' (logo, vai precisar de um Endpoint).
@RequestMapping("/hello") //Essa, para conseguir montar/fazer os Endpoints da API; Deve ser minúsculo, sem espaços!
public class HelloWorld
{
	@GetMapping //Requisição que NÃO precisa de 'corpo'; As outras @PostMapping, @PutMapping, @DeleteMapping precisam!
	public String hello()
	{
		return "Hello World - if nothing's wrong! As mentalidades da Generation são orientação ao futuro, responsabilidade pessoal, crescimento e persistência. Já as habilidades comportamentais são o trabalho em equipe, a atenção aos detalhes, a proatividade e a comunicação.";
	}
}
/* OBSERVAÇÕES:
No Spring, as Classes são definidas mediante o uso das Annotations!
Quando chamar o endereço http://127.0.0.1:8080/hello, ele tem de retornar o 'Hello World!'
CTRL+SHIFT+O ou CTRL+Espaço para adicionar o 'import'!
A 'Dependência JPA' precisou ser excluída porque impede a execução se o Banco de Dados não estiver configurado!
*/