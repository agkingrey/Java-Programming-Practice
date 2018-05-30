
public class ComputerStoreInventory {
	/**
	 * @param args
	 * This program will create ques and stacks, along with perform various methods through them
	 */
	public static void main(String[] args){
	
	//time to create the beginning of my inventory
		
		//hard drives and ssd's
		Queue WDBlack1TBHardDrive = new Queue(100);
		Queue WDBlue2TBHardDrive = new Queue(50);
		Queue Samsung850EvoSSD = new Queue(20);
		Queue Kingston256GBSSD = new Queue(50);
		
		//Motherboards
		Queue GigabyteG1GamingMotherboard = new Queue(10);
		Queue MSI970GamingMotherboard = new Queue(10);
		Queue ASUS9FXMotherboard = new Queue(10);
		Queue AsusMaximusV3HeroMotherboard = new Queue(10);
		Queue MSIZ97Gaming5Motherboard = new Queue(10);
		
		//Power Supplies
		Queue EVGA500WattPowerSupply = new Queue(30);
		Queue EVGA750WattPowerSupply = new Queue(20);
		Queue EVGA100WattPowerSupply = new Queue(10);
		
		//RAM
		Queue Corsair16GB2400MHHZRAM = new Queue(25);
		Queue GSkill8GB1600MHZRAM = new Queue(25);
		Queue KingstonFury16GB1866MHZRAM = new Queue(25);
		
		//GPU
		Queue GTX1060GPU = new Queue(20);
		Queue GTX1070GPU = new Queue(15);
		Queue GTX1080GPU = new Queue(10);
		Queue RX480GPU = new Queue(30);
		Queue TitanXPGPU = new Queue(3);
		
		//CPU
		Queue Intel6700KCPU = new Queue(10);
		Queue Intel7500KCPU = new Queue(10);
		Queue AMDRyzen7CPU = new Queue(10);
		Queue AMDRyzen5CPU = new Queue(10);
		
		//CPU Coolers
		Queue CoolerMasterHyper212EVOCPUCooler = new Queue(20);
		Queue CorsairHyrdroH50CPUCooler = new Queue(5);
		Queue NoctuaNHD14CPUCooler = new Queue(10);
		
		//Cases
		Queue FractalDesignDefineR4Case = new Queue(10);
		Queue CoolerMasterMasterBox5Case = new Queue(10);
		Queue NZXTS340Case = new Queue(10);
		
		//then to create my stack for the Rebate percentage
		Stack rebatePercentage = new Stack(100);
		
		//Now let's create some example orders
		
		//example 1: A customer orders a cpu and cpu cooler for their system
		
		//this will remove the cpu and cooler from their prospective ques
		Intel6700KCPU.remove();
		CoolerMasterHyper212EVOCPUCooler.remove();
		rebatePercentage.push();
		
		//lets check the size of the ques and return the rebate percentage
		System.out.println("Intel 6700 Que size: " +Intel6700KCPU.size());
		System.out.println("Hyper212EVO Que size: " +CoolerMasterHyper212EVOCPUCooler.size());
		rebatePercentage.Print();
		System.out.println("");
		
		//Example 2: The same customer wants to come back and return the order
		Intel6700KCPU.insert(1);
		CoolerMasterHyper212EVOCPUCooler.insert(1);
		rebatePercentage.pop();
		
		//then we need to reprint out to the employee to ensure the process worked
		System.out.println("Intel 6700 Que size: " +Intel6700KCPU.size());
		System.out.println("Hyper212EVO Que size: " +CoolerMasterHyper212EVOCPUCooler.size());
		rebatePercentage.Print();
		System.out.println("");
		
		//Example 3: A customer comes in and asks if the store has any GTX1080 GPUS in stock
		System.out.println(GTX1080GPU.size() +" 1080s left");
		
		//Example 4: A new customer would like a set of ram
		GSkill8GB1600MHZRAM.remove();
		rebatePercentage.push();
		
		//print out to the employee the confirmation
		System.out.println(GSkill8GB1600MHZRAM.size() +" ram left");
		rebatePercentage.Print();
		System.out.println("");
		
		//Example 5: A customer wants a new hard drive and case for their pc
		WDBlack1TBHardDrive.remove();
		FractalDesignDefineR4Case.remove();
		rebatePercentage.push();
		
		//print out one last time
		System.out.println(WDBlack1TBHardDrive.size() + " wd black hard drives left");
		System.out.println(FractalDesignDefineR4Case.size() + " fractal design cases left");
		rebatePercentage.Print();
		
		
	}
}
