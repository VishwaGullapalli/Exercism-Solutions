class ZebraPuzzle {

    String [] colors = {"red", "green", "ivory", "yellow", "blue"};
    String [] nationalities = {"Englishman", "Spaniard", "Ukrainian", "Norwegian", "Japanese"};
    String [] pets = {"horse", "fox", "dog", "zebra", "snail"};
    String [] drinks = {"coffee", "tea", "milk", "orange juice", "water"};
    String [] hobbies = {"dancing", "painter", "reading", "football", "chess"};

    String [] houseColors = new String[5];
    String [] houseNationalities = new String[5];
    String [] housePets = new String[5];
    String [] houseDrinks = new String[5];
    String [] houseHobbies = new String[5];

    boolean [] usedColors = new boolean[5];
    boolean [] usedNationalities = new boolean[5];
    boolean [] usedPets = new boolean[5];
    boolean [] usedDrinks = new boolean[5];
    boolean [] usedHobbies = new boolean[5];

    boolean bool = assignHouses(0);
    String getWaterDrinker() {
        for (int i = 0; i < 5; i++) {
            if ("water".equals(houseDrinks[i])) {
                return houseNationalities[i];
            }
        }
        return null;
    }

    String getZebraOwner() {
        for (int i = 0; i < 5; i++) {
            if ("zebra".equals(housePets[i])) {
                return houseNationalities[i];
            }
        }
        return null;
    }

    boolean assignHouses(int house) {
        if (house == 5) {
            return satisifiesConstraints();
        }
        for (int n = 0; n < 5; n++) {
            if (usedNationalities[n]) {
                continue;
            }
            usedNationalities[n] = true;
            houseNationalities[house] = nationalities[n];

            for (int c = 0; c < 5; c++) {
                if (usedColors[c]) {
                    continue;
                }
                usedColors[c] = true;
                houseColors[house] = colors[c];
                
                for (int d = 0; d < 5; d++) {
                    if (usedDrinks[d]) {
                        continue;
                    }
                    usedDrinks[d] = true;
                    houseDrinks[house] = drinks[d];
                    
                    for (int h = 0; h < 5; h++) {
                        if (usedHobbies[h]) {
                            continue;
                        }
                        usedHobbies[h] = true;
                        houseHobbies[house] = hobbies[h];
                        
                        for (int p = 0; p < 5; p++) {
                            if (usedPets[p]) {
                                continue;
                            }
                            usedPets[p] = true;
                            housePets[house] = pets[p];
                            
                            if (knownConstraints(house) && assignHouses(house + 1)) {
                                return true;
                            }
                            usedPets[p] = false;
                            housePets[house] = null;
                        }
                        usedHobbies[h] = false;
                        houseHobbies[house] = null;
                    }
                    usedDrinks[d] = false;
                    houseDrinks[house] = null;
                }
                usedColors[c] = false;
                houseColors[house] = null;
            }
            usedNationalities[n] = false;
            houseNationalities[house] = null;
        }
        return false;
    }

    boolean satisifiesConstraints() {
        for (int i = 0; i < 5; i++) {
            // Constraint 6
            if (houseColors[i].equals("ivory")) {
                if (i == 4 || !houseColors[i + 1].equals("green")) return false;
            }
            // Constraint 11
            if (houseHobbies[i].equals("reading")) {
                boolean left = (i > 0) && housePets[i - 1].equals("fox");
                boolean right = (i < 4) && housePets[i + 1].equals("fox");
                if (left || right) {
                    return false;
                }
            }
            // Constraint 12
            if (houseHobbies[i].equals("painter")) {
                boolean left = (i > 0) && housePets[i - 1].equals("horse");
                boolean right = (i < 4) && housePets[i + 1].equals("horse");
                if (left || right) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean fixedConditionChecks(int house) {
        // Constraint 2
        if (houseNationalities[house].equals("Englishman") && !houseColors[house].equals("red")) {
            return false;
        }
        // Constraint 3
        if (houseNationalities[house].equals("Spaniard") && !housePets[house].equals("dog")) {
            return false;
        }
        // Constraint 4
        if (houseColors[house].equals("green") && !houseDrinks[house].equals("coffee")) {
            return false;
        }
        // Constraint 5
        if (houseNationalities[house].equals("Ukrainian") && !houseDrinks[house].equals("tea")) {
            return false;
        }
        // Constraint 7
        if (housePets[house].equals("snail") && ! houseHobbies[house].equals("dancing")) {
            return false;
        }
        // Constraint 8
        if (houseColors[house].equals("yellow") && !houseHobbies[house].equals("painter")) {
            return false;
        }
        // Constraint 13
        if (houseHobbies[house].equals("football") && !houseDrinks[house].equals("orange juice")) {
            return false;
        }
        // Constraint 14
        if (houseNationalities[house].equals("Japanese") && !houseHobbies[house].equals("chess")) {
            return false;
        }
        return true;
    }

    boolean knownConstraints(int house) {
        // Constraint 9
        if (house == 2 && !houseDrinks[house].equals("milk")) {
            return false;
        }
        // Constraint 10
        if (house == 0 && !houseNationalities[house].equals("Norwegian")) {
            return false;
        }
        // Constraint 15
        if (house == 1 && !houseColors[house].equals("blue")) {
            return false;
        }
        if (!fixedConditionChecks(house)) {
            return false;
        }
        return true;
    }
}
