package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "partidas")
public class PartidaModel {

    @Id
    private Integer id;
    protected String resultado;
    private EstadoModel estado;
    @Field(name  ="equipe_local")
    private EquipeModel equipeLocal;
    @Field(name  ="equipe_visitante")
    private  EquipeModel equipeVisitante;

    public PartidaModel(){

    }



}
