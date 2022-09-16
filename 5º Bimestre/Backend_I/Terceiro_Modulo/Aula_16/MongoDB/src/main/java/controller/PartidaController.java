package controller;

import model.PartidaModel;
import org.springframework.web.bind.annotation.*;
import service.PartidaService;

import java.sql.PreparedStatement;
import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {
    private PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }
    @PostMapping
    public PartidaModel registrar(@RequestBody PartidaModel partida){
        return partidaService.adicionar(partida);
    }

    @GetMapping
    public List<PartidaModel> listar(){
        return partidaService.listar();
    }

    @GetMapping("/ao-vido")
    public List<PartidaModel> partidasAoVivo(){
        return partidaService.partidaAoVivo();
    }
}

