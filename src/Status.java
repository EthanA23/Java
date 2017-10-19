/*
Author: Ethan Aghai
Date: 10/19/17 
Status for TextAdventure
*/

public enum Status {

	Private(1), PrivateSecondClass(2), PrivateFirstClass(3), ArmySpecialist(4), Corporal(5), Sergeant(6), StaffSergeant(7), 
	
	SergeantFirstClass(8), MasterSergeant(9), FirstSergeant(10), SergeantMajor(11), CommandSergeantMajor(12), 
	
	SergeantMajoroftheArmy(13), WarrantOfficer1(14), ChiefWarrantOfficer2(15), ChiefWarrantOfficer3(16),
	
	ChiefWarrantOfficer4(17), ChiefWarrantOfficer5(18), SecondLieutenant(19), FirstLieutenant(20), Captain(21), Major(22),
	
	LieutenantColonel(23), Colonel(24), BrigadierGenera(25), MajorGeneral(26), LieutenantGeneral(27), General(28), 
	
	GeneraloftheArmy(29);
	
	private final int rank;
	
	private Status(int rank)
	{
		this.rank = rank;
	}
	
	public int getRank()
	{
		return rank;
	}
}
