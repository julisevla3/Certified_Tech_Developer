package service;

import model.EstadoModel;
import model.PartidaModel;
import org.springframework.stereotype.Service;
import repository.PartidaRepository;

import java.util.List;

@Service
public class PartidaService {
    private PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }
    public PartidaModel adicionar (PartidaModel partida){
        return partidaRepository.save(partida);

        }

        public List<PartidaModel> listar(){
        return partidaRepository.findAll();

        }

        public List<PartidaModel> partidaAoVivo(){
            return partidaRepository.findAllByEstado(EstadoModel.AO_VIVO);

        }
}
