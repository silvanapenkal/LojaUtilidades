package tech.devinhouse.lojautilidades.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.lojautilidades.models.Produto;
import tech.devinhouse.lojautilidades.services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(path = "produto")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> get(){
        return produtoService.buscar();
    }

    @PostMapping
    public Produto post(@RequestBody Produto produto) throws Exception{
        return produtoService.salvar(produto);
    }

    @PutMapping
    public Produto put(@RequestBody Produto produto) throws Exception{
        return produtoService.salvar(produto);
    }

    @DeleteMapping
    public boolean delete(Integer id){
        return produtoService.apagar(id);
    }


}
