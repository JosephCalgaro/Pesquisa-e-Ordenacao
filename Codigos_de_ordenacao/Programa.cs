using Projeto.Controllers;

namespace Projeto
{
    public class Program
    {
        public static void Main(string[] args)
        {
            OrdenacaoController controller =
                new OrdenacaoController();

            controller.Executar();
        }
    }
}