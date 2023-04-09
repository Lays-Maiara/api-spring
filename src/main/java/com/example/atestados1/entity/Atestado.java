

package com.example.atestados1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Atestado {
    private int codigo;
    private int codFuncionario;
    private String cidDoenca;
    private int diasAfastamento;
}
