package PEED4;

public class Main { 

    public static void main(String[] args) {

		Emonedero mycash;

        double dinero;

        mycash = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");




        double SDisp = mycash.efectivo();

        System.out.println("El efectivo del monedero es  "+ SDisp );

    }

	/**
	 * @param mycash
	 * @param cash TODO
	 */
	public static void GMonedero(Emonedero mycash, double cash) {
		try 

        {

            mycash.pagar(200);

        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }

        try

        {

            System.out.println("Debes recargar monedero");

            mycash.recargar(300);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }
	}

}