package com.example.atestados1.controller;

import com.example.atestados1.entity.Atestado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gerenciamento")
@Slf4j
public class GerenciamentoController {

    /*@GetMapping("/saudacao")
    public ResponseEntity <Atestado> saudacaoFuncionario(){
        Atestado atestado = new Atestado();
        atestado.setCodigo(12352);
        atestado.setCodFuncionario(25136);
        atestado.setCidDoenca("J11");
        atestado.setDiasAfastamento(03);
        return new ResponseEntity<>(atestado, HttpStatus.OK);
    }*/

    @PostMapping
    public String cadastrarAtestado(@RequestBody Atestado atestado){

        return "Cadastrado com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarAtestado(@RequestBody Atestado atestado, @RequestParam("codigo") int codigo){
        log.info("O codigo é "+codigo);

        return "Atestado alterado com sucesso!";
    }

    @PatchMapping("/alterarDiasAfastamento/{codigo}")
    public String alterarDiasAfastamento(@RequestBody Atestado atestado, @PathVariable("codigo") int codigo){
        return "Dias de afastamento alterados com sucesso!";
    }

    @DeleteMapping("/ecluir/{codigo}")
    public String excluirAtestado(@PathVariable("codigo") int codigo){
        return "Atestado excluido com sucesso";
    }

    @GetMapping("/consultar/funcionario/{codFuncionario}")
    public Atestado consultaAtestadoPorFuncionario(@PathVariable("codFuncionario") int codFuncionario){
        Atestado atestado = new Atestado();
        atestado.setCodigo(32337);
        atestado.setCodFuncionario(355712);
        atestado.setCidDoenca("A90");
        atestado.setDiasAfastamento(04);
        return atestado;
    }

    @GetMapping("/consultar/{codigo}")
    public Atestado consultaAtestado(@PathVariable("codigo") int codigo){
        Atestado atestado = new Atestado();
        atestado.setCodigo(32337);
        atestado.setCodFuncionario(355712);
        atestado.setCidDoenca("A90");
        atestado.setDiasAfastamento(04);
        return atestado;
    }

    @GetMapping("/consultar")
    public Atestado[] consultaAtestadoGeral(){
        Atestado[] atestados = new Atestado[2];
        atestados[0] = new Atestado();
        atestados[0].setCodigo(32337);
        atestados[0].setCodFuncionario(355712);
        atestados[0].setCidDoenca("A90");
        atestados[0].setDiasAfastamento(04);

        atestados[1] = new Atestado();
        atestados[1].setCodigo(32337);
        atestados[1].setCodFuncionario(355712);
        atestados[1].setCidDoenca("A90");
        atestados[1].setDiasAfastamento(04);

        return atestados;
    }

}
