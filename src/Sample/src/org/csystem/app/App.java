/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{
		Date birthDate = new Date(11, 7, 1983);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());

		birthDate.setDay(6);
		birthDate.setMonth(9);
		birthDate.setYear(2021);

		System.out.printf("%02d/%02d/%04d%n", birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
	}
}

class Date {
	private int m_day, m_month, m_year;

	public Date(int day, int month, int year)
	{
		//...
		m_day = day;
		m_month = month;
		m_year = year;
	}

	public int getDay()
	{
		return m_day;
	}

	public void setDay(int day)
	{
		//...
		m_day = day;
	}

	public int getMonth()
	{
		return m_month;
	}

	public void setMonth(int month)
	{
		//...
		m_month = month;
	}

	public int getYear()
	{
		return m_year;
	}

	public void setYear(int year)
	{
		//...
		m_year = year;
	}

	//...
}