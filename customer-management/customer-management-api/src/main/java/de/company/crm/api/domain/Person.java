/** 
 * Generated by KissMDA - Simple Java Cartridge - kissmda-cartridges-simple-java.
 * KissMDA: http://kissmda.org
 *  
 * DO NOT EDIT this file manually! All changes will be overwritten by next generation!
 *  
 * Generation date: Mon Jul 09 14:58:16 CEST 2018.
 */
package de.company.crm.api.domain;
import java.util.Collection;
import java.util.Date;
/**
 * <html> <head> <style> p {padding:0px; margin:0px;} </style> </head> <body>
 * <p>
 * This is the <b>Person entity</b>. We save each person in a database.
 * </p>
 * 
 * <p>
 * &#160;
 * </p>
 * 
 * <p>
 * 
 * @author Lofi Dewanto
 *         </p>
 * 
 *         <p>
 * @version 1.0.0
 *          </p>
 * 
 *          <p>
 * @since 1.0.0
 * 
 *        </p>
 * 
 *        </body> </html>
 */
public interface Person {
	/**
	 * <html> <head> <style> p {padding:0px; margin:0px;} </style> </head>
	 * <body> Calculate the age of this person. </body> </html>
	 */
	Integer calculateAge();
	Date[] run(byte[] content);
	void changeLastAddress(Address address, Boolean isLastOne);
	/**
	 * <html> <head> <style> p {padding:0px; margin:0px;} </style> </head>
	 * <body>
	 * <p>
	 * Name of the person.
	 * 
	 * </p>
	 * 
	 * </body> </html>
	 */
	String getName();
	/**
	 * <html> <head> <style> p {padding:0px; margin:0px;} </style> </head>
	 * <body>
	 * <p>
	 * Name of the person.
	 * 
	 * </p>
	 * 
	 * </body> </html>
	 */
	void setName(String name);
	Collection<Address> getAddresses();
	void addAddress(Address address);
	/**
	 * Nickname will be "calculated" from name.
	 */
	String getNickname();
	Boolean isInRetirement();
}
