import Component from "./Component";



function App() {
  return(
    <>
   <h1 style={
    {
    color:'blue'
   }

   }> Hello Word</h1>
  <p>Meu Conteudo</p>
  <button onClick={()=> alert("ok")}>Pressione</button>


  {/* componente chamando na tela */}
  <Component/>

  
  </>
  );
}

export default App;
