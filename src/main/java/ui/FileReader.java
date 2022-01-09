package ui;

import models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {


    public List<PcCase> retrieveCases(){
        File file = new File("PcCases.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<PcCase> pcCaseList = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] pcCaseAttributes = line.split(",");
            PcCase pcCase = new PcCase(pcCaseAttributes[0],pcCaseAttributes[1],
            new BigDecimal(pcCaseAttributes[2]), Integer.parseInt(pcCaseAttributes[3]),
            Integer.parseInt(pcCaseAttributes[4]), Integer.parseInt(pcCaseAttributes[5]),
            Integer.parseInt(pcCaseAttributes[6]), Integer.parseInt(pcCaseAttributes[7]));
            pcCaseList.add(pcCase);
        }
        return (pcCaseList);
    }

    public List <Ryzen> retrieveRyzen(){
        File file = new File("RyzenProcessors.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Ryzen> ryzenList = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] ryzenAttributes = line.split(",");
            Ryzen ryzen = new Ryzen(ryzenAttributes[0],ryzenAttributes[1], new BigDecimal(ryzenAttributes[2]),
            Integer.parseInt(ryzenAttributes[3]), ryzenAttributes[4], Integer.parseInt(ryzenAttributes[5]),
            Integer.parseInt(ryzenAttributes[6]), Integer.parseInt(ryzenAttributes[7]));
            ryzenList.add(ryzen);
        }
        return ryzenList;
    }
    public List <Intel> retrieveIntel() {
        File file = new File("12thGenIntelCoreProcessors.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Intel> intelList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] intelAttributes = line.split(",");
            Intel intel = new Intel(intelAttributes[0],intelAttributes[1], new BigDecimal(intelAttributes[2]),
            Integer.parseInt(intelAttributes[3]), intelAttributes[4], Integer.parseInt(intelAttributes[5]),
            Integer.parseInt(intelAttributes[6]), Integer.parseInt(intelAttributes[7]),
            Integer.parseInt(intelAttributes[8]), Integer.parseInt(intelAttributes[9]));
            intelList.add(intel);
        }
        return intelList;
    }
    public List <Motherboard> retrieveMotherboards(){
        File file = new File("Motherboards.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Motherboard> motherboardList = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] motherboardAttributes = line.split(",");
            Motherboard motherboard = new Motherboard(motherboardAttributes[0],motherboardAttributes[1],
            new BigDecimal(motherboardAttributes[2]), Integer.parseInt(motherboardAttributes[3]),
            motherboardAttributes[4], Integer.parseInt(motherboardAttributes[5]));
            motherboardList.add(motherboard);
        }
        return motherboardList;
    }

    public List<Memory> retrieveMemory() {

        File file = new File("Memory.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Memory> memoryList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] memoryAttributes = line.split(",");
            Memory memory = new Memory(memoryAttributes[0],memoryAttributes[1], new BigDecimal(memoryAttributes[2]),
            Integer.parseInt(memoryAttributes[3]), Integer.parseInt(memoryAttributes[4]), memoryAttributes[5]);
            memoryList.add(memory);
        }
        return memoryList;
    }

    public List <Cooler> retrieveCoolers() {
        File file = new File("Coolers.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Cooler> coolerList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] coolerAttributes = line.split(",");
            Cooler cooler = new Cooler(coolerAttributes[0],coolerAttributes[1],
            new BigDecimal(coolerAttributes[2]),Integer.parseInt(coolerAttributes[3]),Integer.parseInt(coolerAttributes[4]));
            coolerList.add(cooler);
        }
        return coolerList;
    }

    public List <Storage> retrieveStorage(){
        File file = new File("Storage.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Storage> storageList = new ArrayList<>();
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] storageAttributes = line.split(",");
            Storage storage = new Storage(storageAttributes[0],storageAttributes[1],
            new BigDecimal(storageAttributes[2]),Integer.parseInt(storageAttributes[3]),
            new BigDecimal (storageAttributes[4]), Boolean.parseBoolean(storageAttributes[5]),
            Boolean.parseBoolean(storageAttributes[6]));
            storageList.add(storage);
        }
        return storageList;
    }

    public List <GraphicsCard> retrieveGraphicsCards() {
        File file = new File("GraphicsCards.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<GraphicsCard> graphicsCardList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] graphicsCardAttributes = line.split(",");
            GraphicsCard graphicsCard = new GraphicsCard(graphicsCardAttributes[0], graphicsCardAttributes[1],
            new BigDecimal(graphicsCardAttributes[2]), Integer.parseInt(graphicsCardAttributes[3]),
            Integer.parseInt(graphicsCardAttributes[4]),Integer.parseInt(graphicsCardAttributes[5]));
            graphicsCardList.add(graphicsCard);
        }
        return graphicsCardList;
    }

    public List <Psu> retrievePsus() {
        File file = new File("Psus.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Psu> psuList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] psuAttributes = line.split(",");
            Psu psu = new Psu(psuAttributes[0],psuAttributes[1], new BigDecimal(psuAttributes[2]),
            Integer.parseInt(psuAttributes[3]), Integer.parseInt(psuAttributes[4]));
            psuList.add(psu);
        }
        return psuList;
    }

    public List <Fan> retrieveFans() {
        File file = new File("Fans.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Fan> fanList = new ArrayList<>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] fanAttributes = line.split(",");
            Fan fan = new Fan(fanAttributes[0], fanAttributes[1], new BigDecimal(fanAttributes[2]),
            Integer.parseInt(fanAttributes[3]),  new BigDecimal(fanAttributes[4]),
            Integer.parseInt(fanAttributes[5]),  new BigDecimal(fanAttributes[6]));
            fanList.add(fan);
        }
        return fanList;
    }
}

