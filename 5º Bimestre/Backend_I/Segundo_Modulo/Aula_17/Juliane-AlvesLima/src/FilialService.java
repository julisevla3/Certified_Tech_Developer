public class FilialService {

        private static IDao<Filial>filialIDao;

        public FilialService (IDao<Filial> FilialDao){

            filialIDao = FilialDao;
        }

        public static Filial salvar(Filial filial){
            return filialIDao.salvar(filial);
        }


}
