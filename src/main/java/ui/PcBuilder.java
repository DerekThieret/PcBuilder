package ui;

import models.*;


import java.util.List;
import java.util.Scanner;

public class PcBuilder {

    public void run(){
        System.out.println("Welcome to Pc Builder");
        Scanner scanner = new Scanner(System.in);
        Computer computerMade = new Computer();
        FileReader fileReader = new FileReader();


        List<PcCase> pcCases = fileReader.retrieveCases();
        for (PcCase pcCase : pcCases) {
            System.out.println(pcCase);
        }
        PcCase userCase = null;
        Integer fanSpaces = null;
        Integer fanCounter = 0;
        Boolean validCase = false;
        while (!validCase) {
            System.out.println("Please enter a valid case ID: ");
            String caseSelected = scanner.nextLine();
            for (PcCase pcCase : pcCases) {
                if (caseSelected.equals(pcCase.getPartId())) {
                    userCase = pcCase;
                    fanSpaces = userCase.getFansSupported() - userCase.getFansIncluded();
                    fanCounter = fanCounter + userCase.getFansIncluded();
                    computerMade.addComponent(userCase);
                    validCase = true;
                }
            }
        }

        List<Ryzen> ryzenList = fileReader.retrieveRyzen();
        for (Ryzen ryzen : ryzenList) {
            if (ryzen.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(ryzen);
            }
        }
        List<Intel> intelList = fileReader.retrieveIntel();
        for (Intel intel : intelList) {
            if (intel.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(intel);
            }
        }
        Ryzen userRyzen = null;
        Intel userIntel = null;
        Integer cpuWattage = null;
        Boolean validCpu = false;
        while (!validCpu) {
            System.out.println("Please enter a valid Cpu ID: ");
            String cpuSelected = scanner.nextLine();
            for (Ryzen ryzen : ryzenList) {
                if (cpuSelected.equals(ryzen.getPartId())) {
                    userRyzen = ryzen;
                    cpuWattage = ryzen.getWattage();
                    computerMade.addComponent(userRyzen);
                    validCpu = true;
                }
            }
            for (Intel intel : intelList) {
                if (cpuSelected.equals(intel.getPartId())) {
                    userIntel = intel;
                    cpuWattage = intel.getWattage();
                    computerMade.addComponent(userIntel);
                    validCpu = true;
                }
            }
        }

        List<Motherboard> motherboardList = fileReader.retrieveMotherboards();
        Motherboard userMotherboard = null;
        if (userRyzen != null && userRyzen.getSocket().equals("Am4")) {
            for (Motherboard motherboard : motherboardList) {
                if (motherboard.getSocket().equals("Am4") && motherboard.getSizeCode() <= userCase.getSizeCode()) {
                    System.out.println(motherboard);
                }
            }
        }
        if (userRyzen != null) {
            Boolean validAmdMobo = false;
            while (!validAmdMobo) {
                System.out.println("Please enter a valid motherboard ID: ");
                String motherboardSelected = scanner.nextLine();
                for (Motherboard motherboard1 : motherboardList) {
                    if (motherboardSelected.equals(motherboard1.getPartId())) {
                        userMotherboard = motherboard1;
                        computerMade.addComponent(motherboard1);
                        validAmdMobo = true;
                    }
                }
            }
        }
        if (userIntel != null && userIntel.getSocket().equals("LGA1700")) {
            for (Motherboard motherboard : motherboardList) {
                if (motherboard.getSocket().equals("LGA1700") && motherboard.getSizeCode() <= userCase.getSizeCode()) {
                    System.out.println(motherboard);
                }
            }
        }
        if (userIntel != null) {
            Boolean validIntelMobo = false;
            while (!validIntelMobo) {
                System.out.println("Please enter a valid motherboard ID: ");
                String motherboardSelected = scanner.nextLine();
                for (Motherboard motherboard2 : motherboardList) {
                    if (motherboardSelected.equals(motherboard2.getPartId())) {
                        userMotherboard = motherboard2;
                        computerMade.addComponent(motherboard2);
                        validIntelMobo = true;
                    }
                }
            }
        }

        List<Memory> memoryList = fileReader.retrieveMemory();
        for (Memory memory : memoryList) {
            if (memory.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(memory);
            }
        }
        Boolean validMemoryKit = false;
        while (!validMemoryKit) {
            System.out.println("Please enter a valid Memory Kit ID: ");
            String memorySelected = scanner.nextLine();
            for (Memory memory : memoryList) {
                if (memorySelected.equals(memory.getPartId())) {
                    computerMade.addComponent(memory);
                    validMemoryKit = true;
                }
            }
        }

        List<Cooler> coolerList = fileReader.retrieveCoolers();
        for (Cooler cooler : coolerList) {
            if (cooler.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(cooler);
            }
        }
        Boolean validCooler = false;
        while (!validCooler) {
            System.out.println("Please enter a valid Cooler ID: ");
            String coolerSelected = scanner.nextLine();
            for (Cooler cooler : coolerList) {
                if (coolerSelected.equals(cooler.getPartId())) {
                    computerMade.addComponent(cooler);
                    fanSpaces = fanSpaces - cooler.getFanSpacesTaken();
                    fanCounter = fanCounter + cooler.getFanSpacesTaken();
                    validCooler = true;
                }
            }
        }

        List<GraphicsCard> graphicsCardList = fileReader.retrieveGraphicsCards();
        Integer gpuWattage = null;
        for (GraphicsCard graphicsCard : graphicsCardList) {
            if (graphicsCard.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(graphicsCard);
            }
        }
        Boolean validGpu = false;
        while (!validGpu) {
            System.out.println("Please enter a valid Graphics Card ID: ");
            String graphicsCardSelected = scanner.nextLine();
            for (GraphicsCard graphicsCard : graphicsCardList) {
                if (graphicsCardSelected.equals(graphicsCard.getPartId())) {
                    gpuWattage = graphicsCard.getWattage();
                    computerMade.addComponent(graphicsCard);
                    validGpu = true;
                }
            }
        }

        List<Psu> psuList = fileReader.retrievePsus();
        for (Psu psu : psuList) {
            if (psu.getSizeCode() <= userCase.getSizeCode() && (psu.getWattage() * .7 > gpuWattage + cpuWattage)) {
                System.out.println(psu);
            }
        }
        Boolean validPsu = false;
        while (!validPsu) {
            System.out.println("Please enter a valid Power Supply ID: ");
            String psuSelected = scanner.nextLine();
            for (Psu psu : psuList) {
                if (psuSelected.equals(psu.getPartId())) {
                    computerMade.addComponent(psu);
                    validPsu = true;
                }
            }
        }

        List<Storage> storageList = fileReader.retrieveStorage();
        for (Storage storage : storageList) {
            if (storage.getNvme() == true) {
                System.out.println(storage);
            }
        }
        boolean moreNvmeDrives = true;
        int nvmeCounter = 0;
        while (moreNvmeDrives) {
            System.out.println("Please enter a valid nvme Drive ID: ");
            String storageSelected = scanner.nextLine();
            if (nvmeCounter < userMotherboard.getNvmeSupported()) {
                for (Storage storage : storageList) {
                    if (storageSelected.equals(storage.getPartId())) {
                        computerMade.addComponent(storage);
                        nvmeCounter++;
                    }
                }
                if (nvmeCounter == userMotherboard.getNvmeSupported()) {
                    moreNvmeDrives = false;
                    System.out.println("No more nvme drives can be added. (Enter to continue)");
                }
            }
            if (nvmeCounter < userMotherboard.getNvmeSupported())
                System.out.println("Would you like to add another nvme drive? ('Yes' or 'No')");
            if (scanner.nextLine().equalsIgnoreCase("No")) {
                moreNvmeDrives = false;
                System.out.println("No more nvme drives will be added.");
            }
        }

        List<Storage> storageList1 = fileReader.retrieveStorage();
        for (Storage storage1 : storageList1) {
            if (storage1.getSizeCode() <= userCase.getSizeCode() && storage1.getNvme() == false) {
                System.out.println(storage1);
            }
        }
        boolean moreDrives = true;
        Integer ssdCounter = 0;
        Integer hddCounter = 0;
        Integer ssdSpots = userCase.getSsdsSupported();
        Integer hddSpots = userCase.getHddsSupported();
        while (moreDrives) {
            System.out.println("Please enter a valid mass storage drive ID: ");
            String storageSelected = scanner.nextLine();
            if (ssdCounter <= userCase.getSsdsSupported() && hddCounter <= userCase.getHddsSupported()) {
                for (Storage storage2 : storageList1) {
                    if (storageSelected.equals(storage2.getPartId())) {
                        computerMade.addComponent(storage2);
                    }
                    if (storageSelected.equals(storage2.getPartId()) && storage2.getSsd() && ssdSpots == hddSpots) {
                        ssdCounter++;
                        ssdSpots--;
                        hddSpots--;
                    } else if (storageSelected.equals(storage2.getPartId()) && storage2.getSsd() && ssdSpots > hddSpots) {
                        ssdCounter++;
                        ssdSpots--;
                    } else if (storageSelected.equals(storage2.getPartId()) && !storage2.getSsd()) {
                        hddCounter++;
                        hddSpots--;
                        ssdSpots--;
                    }
                }
                if (ssdSpots == 0 && hddSpots == 0) {
                    moreDrives = false;
                    System.out.println("No more mass storage drives can be added.");
                }
            }
            if ((ssdCounter < userCase.getSsdsSupported() && ssdSpots > 0) || (hddCounter < userCase.getHddsSupported() && hddCounter > 0)) {
                System.out.println("Would you like to add another drive? ('Yes' or 'No')");
                if (scanner.nextLine().equalsIgnoreCase("No")) {
                    moreDrives = false;
                    System.out.println("No more mass storage drives will be added.");
                }
            }
        }

        List<Fan> fanList = fileReader.retrieveFans();
        for (Fan fan : fanList) {
            if (fan.getSizeCode() <= userCase.getSizeCode()) {
                System.out.println(fan);
            }
        }
        boolean moreFans = true;
        while (moreFans) {
            if (fanCounter != 1 && fanSpaces != 1) {
                System.out.println("You currently have " + fanCounter + " fans and " + fanSpaces + " empty fan spaces in your case");
            }
            if (fanCounter != 1 && fanSpaces == 1) {
                System.out.println("You currently have " + fanCounter + " fans and 1 empty fan space in your case");
            }
            if (fanCounter == 1 && fanSpaces != 1) {
                System.out.println("You currently have 1 fan and " + fanSpaces + " empty fan spaces in your case");
            }
            if (fanCounter == 1 && fanSpaces == 1) {
                System.out.println("You currently have 1 fan and 1 empty fan space in your case");
            }
            System.out.println("Would you like to add more fans to your order? ('Yes' or 'No')");
            String userChoice = scanner.nextLine();
            if (userChoice.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the ID of the fan you would like to add: ");
                String fanSelected = scanner.nextLine();
                for (Fan fan1 : fanList) {
                    if (fanSelected.equals(fan1.getPartId())) {
                        computerMade.addComponent(fan1);
                        fanCounter++;
                        fanSpaces--;

                    }
                }
            }
              if (userChoice.equalsIgnoreCase("No")) {
                System.out.println("made it here");
                moreFans = false;
                System.out.println("No more fans will be added.");
            }
        }
        System.out.println(computerMade);
    }
}

