package controller;

import model.TorneioModel;
import org.springframework.web.bind.annotation.*;
import service.TorneioService;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {
    private TorneioService torneioService;

    public TorneioController(TorneioService torneioService) {
        this.torneioService = torneioService;
    }

    @PostMapping
    public TorneioModel adiconarTorneio(@RequestBody TorneioModel torneio){
       return torneioService.guardarTorneio(torneio);
    }

    @GetMapping
    public List<TorneioModel>
    return

    public TorneioService getTorneioService() {
        return torneioService.
    }
}
