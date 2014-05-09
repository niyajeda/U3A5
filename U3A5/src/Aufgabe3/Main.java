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
		if(amt1 != null)
			amt1.registerCar("A100", "Merkel", "Berin");

		TransportAuthority amt2 = TransportAuthority.AmtErstellen();
		if(amt2 != null)
			amt2.registerCar("B101", "Gabriel", "Hannover");

		MeterMaid poli1 = MeterMaid.PolitesseErstellen();
		if(poli1 != null)
		{
			poli1.checkCar("A100");
			poli1.fine();
			poli1.printTicket();
		}

		MeterMaid poli2 = MeterMaid.PolitesseErstellen();
		if(poli2 != null)
		{
			poli2.checkCar("B101");
			poli2.fine();
			poli2.printTicket();
		}
	}
}