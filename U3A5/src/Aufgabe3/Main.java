/**
 * 
 */
package Aufgabe3;

/**
 * @author bruce
 *
 */
public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		TransportAuthority amt1 = TransportAuthority.AmtErstellen();
		TransportAuthority amt2 = TransportAuthority.AmtErstellen();

		amt1.registerCar("A100", "Merkel", "Berin");
		amt2.registerCar("B101", "Gabriel", "Hannover");

		MeterMaid poli1 = MeterMaid.PolitesseErstellen();

		poli1.checkCar("A100");
		poli1.fine();
		poli1.printTicket();

		MeterMaid poli2 = MeterMaid.PolitesseErstellen();

		poli2.checkCar("B101");
		poli2.fine();
		poli2.printTicket();
	}
}