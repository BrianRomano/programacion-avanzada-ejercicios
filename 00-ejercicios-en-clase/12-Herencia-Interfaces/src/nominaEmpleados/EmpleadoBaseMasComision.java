package nominaEmpleados;

public class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario )
   {
      super( nombre, apellido, nss, ventas, tarifa );
      establecerSalarioBase( salario ); // valida y almacena el salario base
   } // fin del constructor de EmpleadoBaseMasComision con seis argumentos

   // establece el salario base
   public void establecerSalarioBase( double salario )
   {
      if (salario >= 0.0 )
         salarioBase = salario;
      else
         throw new IllegalArgumentException(
            "El salario base debe ser >= 0.0" );
   } // fin del m�todo establecerSalarioBase

   // devuelve el salario base
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } // fin del m�todo obtenerSalarioBase

   // calcula los ingresos; sobrescribe el m�todo ingresos en EmpleadoPorComision
   @Override
   public double obtenerMontoPago()
   {
      return obtenerSalarioBase() + super.obtenerMontoPago();
   } // fin del m�todo ingresos

   // devuelve representaci�n String de un objeto EmpleadoBaseMasComision
   @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f", 
         "con salario base", super.toString(), 
         "salario base", obtenerSalarioBase() );
   } // fin del m�todo toString   
} // fin de la clase EmpleadoBaseMasComision
