package com.example.atestados1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Funcionario {
    int codigo;
    String nome;
    String cpf;
    String cargo;
    Double salario;
    Atestado atestado;

}
