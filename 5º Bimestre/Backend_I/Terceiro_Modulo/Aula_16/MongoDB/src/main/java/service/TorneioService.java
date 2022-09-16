package service;

import model.TorneioModel;
import org.springframework.stereotype.Service;
import repository.TorneioRepository;

import java.util.List;

@Service
public class TorneioService {
    private TorneioRepository torneioRepository;

    public TorneioService(TorneioRepository torneioRepository) {
        this.torneioRepository = torneioRepository;
    }

    public TorneioModel guardarTorneio(TorneioModel torneio){
        return torneioRepository.save(torneio);

    }

    public List<TorneioModel> listarTorneio(){
        return torneioRepository.findAll();
    }
}
