import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
      int n1=Integer.parseInt(JOptionPane.showInputDialog ("Digita el numero 1: "));
      int n2=Integer.parseInt(JOptionPane.showInputDialog ("Digita el numero 2: "));

      Operaciones op=new Operaciones();
      int suma= op.sumar(n1, n2);
      int resta= op.restar(n1, n2);
      int multiplicacion= op.multiplicar(n1, n2);
      int division= op.dividir(n1, n2);
      op.mostrarResultados(suma, resta, multiplicacion, division);
    }
}