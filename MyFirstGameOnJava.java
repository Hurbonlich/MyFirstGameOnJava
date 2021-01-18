public class MyFirstGameOnJava {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);


    public static void main(String[] args) {
        int lifeOfHeroOne, lifeOfHeroTwo, attackOfHeroOne, attackOfHeroTwo, chooseYourWeapon, weapon;
        lifeOfHeroOne = 25;
        lifeOfHeroTwo = 25;


        char yesOrNot;

        System.out.println("Bienvenu dans le jeu : 'Combat des heros' !");

        System.out.println("Entre ton nom de joueur : ");
        String nameOfHeroOne = scanner.next();

        System.out.println("Entre le nom de ton adversaire : ");
        String nameOfHeroTwo = scanner.next();

        System.out.println("Aujourd'hui, nous assistons au combat entre " + nameOfHeroOne +" et "+ nameOfHeroTwo );
        System.out.println("Vous incarnez donc "+nameOfHeroOne+ " !! ");


        System.out.println(" Choisi ton arme !  ");
        System.out.println(" 1. Hache a deux mains ( inflige 3-8 dmg ) ");
        System.out.println(" 2. Epee et bouclier ( inflige 3-6 dmg et bloque 2 )");
        System.out.println(" 3. Deux dagues (inflige 2-4 et attaque deux fois )");
        System.out.println(" 4. Mains nues (inflige 1-6 dmg) ");

        System.out.println(" Tape le numero correspondant a ton arme : ");
        chooseYourWeapon = scanner.nextInt();

        switch (chooseYourWeapon) {
            case 1:
                System.out.println(" Tu as pris la hache a deux mains !");
                weapon = 1;
                break;

            case 2:
                System.out.println(" Tu as pris l'epee et le bouclier !");
                weapon = 2;
                break;

            case 3:
                System.out.println(" Tu as prix les deux dagues !");
                weapon = 3;
                break;

            case 4:
                System.out.println(" Tu as pris... Ah non... Tu n'as rien pris. Bonne chance ! ");
                weapon = 4;
                break;

            default:
                System.out.println(" Tu sembles n'avoir pas compris... Bon, Tu vas te battre a mains nues alors !");
                weapon = 4;
                break;

        }

        // Combat avec la hache a deux mains 3-8 dmg
        if (weapon == 1){
            while (lifeOfHeroOne > 0 && lifeOfHeroTwo > 0){
                if (lifeOfHeroOne > 0) {
                    System.out.println(nameOfHeroOne + " attaque " + nameOfHeroTwo);
                    attackOfHeroOne = unEntierAuHasardEntre(3, 5);
                    lifeOfHeroTwo = lifeOfHeroTwo - attackOfHeroOne;
                    System.out.println(nameOfHeroOne + " inflige " + attackOfHeroOne + " points de degats !");
                    System.out.println(nameOfHeroTwo + " perd " + attackOfHeroOne + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroTwo + " points de vie !");
                    System.out.println("===================================================== ");

                    if (lifeOfHeroTwo > 0){
                    System.out.println("Voulez-vous continuer le combat ? (o/n)");
                    yesOrNot = scanner.next().charAt(0);
                    if (yesOrNot != 'o' ) {
                        lifeOfHeroOne = 0;
                        lifeOfHeroTwo = 0;
                    }
                    }
                    if (lifeOfHeroTwo <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroOne+ " ! ");
                    }

                }

                if (lifeOfHeroTwo > 0) {
                    System.out.println(nameOfHeroTwo + " attaque " + nameOfHeroOne);
                    attackOfHeroTwo = unEntierAuHasardEntre(2, 6);
                    lifeOfHeroOne = lifeOfHeroOne - attackOfHeroTwo + 2;
                    System.out.println(nameOfHeroTwo + " inflige " + attackOfHeroTwo + " points de degats !");
                    System.out.println(nameOfHeroOne + " perd " + attackOfHeroTwo + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroOne + " points de vie ! ");
                    System.out.println("===================================================== ");
                    if (lifeOfHeroOne <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroTwo+ " ! ");
                    }


                }


            }

        }

// Combat avec l'epee et le bouclier 3-6 dmg et bloque 2
        if (weapon == 2){
            while (lifeOfHeroOne > 0 && lifeOfHeroTwo > 0){
                if (lifeOfHeroOne > 0) {
                    System.out.println(nameOfHeroOne + " attaque " + nameOfHeroTwo);
                    attackOfHeroOne = unEntierAuHasardEntre(3, 8);
                    lifeOfHeroTwo = lifeOfHeroTwo - attackOfHeroOne;
                    System.out.println(nameOfHeroOne + " inflige " + attackOfHeroOne + " points de degats !");
                    System.out.println(nameOfHeroTwo + " perd " + attackOfHeroOne + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroTwo + " points de vie !");
                    System.out.println("===================================================== ");


                    if (lifeOfHeroTwo > 0){
                        System.out.println("Voulez-vous continuer le combat ? (o/n)");
                        yesOrNot = scanner.next().charAt(0);
                        if (yesOrNot != 'o' ) {
                            lifeOfHeroOne = 0;
                            lifeOfHeroTwo = 0;
                        }
                    }
                    if (lifeOfHeroTwo <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroOne+ " ! ");
                    }

                }
                if (lifeOfHeroTwo > 0) {
                    System.out.println(nameOfHeroTwo + " attaque " + nameOfHeroOne);
                    attackOfHeroTwo = unEntierAuHasardEntre(2, 6);
                    lifeOfHeroOne = lifeOfHeroOne - attackOfHeroTwo;
                    System.out.println(nameOfHeroTwo + " inflige " + attackOfHeroTwo + " points de degats !");
                    System.out.println(nameOfHeroOne + " perd " + attackOfHeroTwo + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroOne + " points de vie ! ");
                    System.out.println("===================================================== ");
                    if (lifeOfHeroOne <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroTwo+ " ! ");
                    }

                }


            }

        }

// Combat avec deux dagues 2-4 dmg x2
        if (weapon == 3){
            while (lifeOfHeroOne > 0 && lifeOfHeroTwo > 0){
                if (lifeOfHeroOne > 0) {
                    System.out.println(nameOfHeroOne + " attaque " + nameOfHeroTwo);
                    attackOfHeroOne = unEntierAuHasardEntre(2, 4)*2;
                    lifeOfHeroTwo = lifeOfHeroTwo - attackOfHeroOne;
                    System.out.println(nameOfHeroOne + " inflige " + attackOfHeroOne + " points de degats !");
                    System.out.println(nameOfHeroTwo + " perd " + attackOfHeroOne + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroTwo + " points de vie !");
                    System.out.println("===================================================== ");


                    if (lifeOfHeroTwo > 0){
                        System.out.println("Voulez-vous continuer le combat ? (o/n)");
                        yesOrNot = scanner.next().charAt(0);
                        if (yesOrNot != 'o' ) {
                            lifeOfHeroOne = 0;
                            lifeOfHeroTwo = 0;
                        }
                    }
                    if (lifeOfHeroTwo <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroOne+ " ! ");
                    }
                }
                if (lifeOfHeroTwo > 0) {
                    System.out.println(nameOfHeroTwo + " attaque " + nameOfHeroOne);
                    attackOfHeroTwo = unEntierAuHasardEntre(2, 6);
                    lifeOfHeroOne = lifeOfHeroOne - attackOfHeroTwo;
                    System.out.println(nameOfHeroTwo + " inflige " + attackOfHeroTwo + " points de degats !");
                    System.out.println(nameOfHeroOne + " perd " + attackOfHeroTwo + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroOne + " points de vie ! ");
                    System.out.println("===================================================== ");
                    if (lifeOfHeroOne <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroTwo+ " ! ");
                    }

                }


            }

        }

        // Combat à mains nues 1-6 dmg
        if (weapon == 4){
            while (lifeOfHeroOne > 0 && lifeOfHeroTwo > 0){
                if (lifeOfHeroOne > 0) {
                    System.out.println(nameOfHeroOne + " attaque " + nameOfHeroTwo);
                    attackOfHeroOne = unEntierAuHasardEntre(1, 6);
                    lifeOfHeroTwo = lifeOfHeroTwo - attackOfHeroOne;
                    if (attackOfHeroOne == 1){
                        System.out.println(nameOfHeroOne + " inflige " + attackOfHeroOne + " point de degats !");
                        System.out.println(nameOfHeroTwo + " perd " + attackOfHeroOne + " point de vie !");
                    } else {
                        System.out.println(nameOfHeroOne + " inflige " + attackOfHeroOne + " points de degats !");
                        System.out.println(nameOfHeroTwo + " perd " + attackOfHeroOne + " points de vie !");
                    }

                    System.out.println("Il lui reste " + lifeOfHeroTwo + " points de vie !");
                    System.out.println("===================================================== ");


                    if (lifeOfHeroTwo > 0){
                        System.out.println("Voulez-vous continuer le combat ? (o/n)");
                        yesOrNot = scanner.next().charAt(0);
                        if (yesOrNot != 'o' ) {
                            lifeOfHeroOne = 0;
                            lifeOfHeroTwo = 0;
                        }
                    }
                    if (lifeOfHeroTwo <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroOne+ " ! ");
                    }

                }
                if (lifeOfHeroTwo > 0) {
                    System.out.println(nameOfHeroTwo + " attaque " + nameOfHeroOne);
                    attackOfHeroTwo = unEntierAuHasardEntre(2, 6);
                    lifeOfHeroOne = lifeOfHeroOne - attackOfHeroTwo;
                    System.out.println(nameOfHeroTwo + " inflige " + attackOfHeroTwo + " points de degats !");
                    System.out.println(nameOfHeroOne + " perd " + attackOfHeroTwo + " points de vie !");
                    System.out.println("Il lui reste " + lifeOfHeroOne + " points de vie ! ");
                    System.out.println("===================================================== ");
                    if (lifeOfHeroOne <= 0){
                        System.out.println(" Le vainqueur est "+ nameOfHeroTwo+ " ! ");
                    }

                }


            }

        }





    }


    private static int unEntierAuHasardEntre (int valeurMinimale, int valeurMaximale){
        double nombreReel;
        int resultat;

        nombreReel = Math.random();
        resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1))
                + valeurMinimale;
        return resultat;
    }
}
