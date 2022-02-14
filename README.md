# Vježbe 5 iz predmeta "Razvoj mobilnih aplikacija"
## Specifikacije 
1. Promijeniti stil aplikacije (proizvoljno)
2. Napraviti aplikaciju koja će nakon pokretanja izgledati kao slika ispod:
3. ![image](https://user-images.githubusercontent.com/59321839/153960018-b68b65e5-306b-4c5a-a0cc-c5ee6b5fc6a7.png)

4. MyGame preimenovati u naziv igrice po vašem izboru
5. Klikom na dugme “START” otvara se nova aktivnost koja izgleda kao slika ispod:
6. ![image](https://user-images.githubusercontent.com/59321839/153960144-12c436b4-33f5-40fe-b1b8-12ba0ba3c56f.png)

7. First Name i Last Name su polja za unos imena i prezimena korisnika koji započinje sa igricom
8. U polje “Target Points” unosi se broj različit od 0 (od -300 do 300)
9. Klikom na dugme “START” provjere se unesena polja.
      *   Polja “First Name” i “Last Name” ne smiju biti prazna.
      *   Polje “Target Points” ne smije biti prazno, 0 i manjiod -300 i veći od 300.
    
8. Nakon toga otvara se nova aktivnost koja izgleda kao slika ispod:
9. ![image](https://user-images.githubusercontent.com/59321839/153960311-795e6aa7-fccb-499b-9b56-2e59d518045e.png)

10. Naslov aktivnosti je naziv koji ste postavili na početku aplikacije
11. Polje “Player: ... “ sadrži ime i prezime koje je uneseno u prethodnoj aktivnosti
12. Polje “Target points: ... “ sadrži broj koji je unesenu prethodnoj aktivnosti
13. Polje “Current points: ... “ prikazuje trenutne bodove
    * Na početku je ovaj broj jednak 0
    * Cilj je da polje “Current points” bude jednako “Targetpoints” polju.
    * Broj u zagradi je broj klikova na zeleno ili crveno dugme    
14. Dugmici:
    * Crveni dugmić: klikom na ovaj dugmić generiše se neki random broj [-20, -1]. Dobijeni
       broj prikazan je u polju iznad (na slici prikazanbroj 10) i trenutni bodovi (current points)
       se smanje za taj broj.
    * Zeleni dugmić: klikom na ovaj dugmić generiše se neki random broj [1, 20]. Dobijeni
       broj prikazan je u polju iznad (na slici prikazan broj 10) i trenutni bodovi (current points)
       se povećaju za taj broj.
    * Plavi dugmić: klikom na ovaj dugmić prekida se igra i prikazuje se prva aktivnost
       (“Welcome activity”).     
14. Cilj igre je da se na osnovu klikova crvenog i zelenog dugmića dostigne broj u polju “Target
    points”
15. Prikazana polja nije moguće ručno promijeniti.
16. U trenutku kada se izjednače “Target points” i “Currentpoints” polja:
    * crveni i zeleni dugmić više nije moguće kliknuti; 
    * dugmić “Give up” više nike vidljiv;
    * dugmić Finish se prikaže;
    *  ![image](https://user-images.githubusercontent.com/59321839/153960807-4d50b8df-0717-479f-9225-2fb13704b54b.png)

    
18. Klikom na dugme “Finish” vraćamo se na prethodnu aktivnost(ne kreirati novu) gdje će se kao
rezultat poslati ime i prezime igrača kao i broj klikovakoji je bio potreban za ostvarenje rezultata
(na slici 22).
19. Prethodna aktivnost sada treba izgledati kao na slici ispod:
20. ![image](https://user-images.githubusercontent.com/59321839/153961011-a6c8a256-423e-4105-970e-3b7215b05f7f.png)
21. Strelica < u toolbaru treba da vrati na početnu aktivnost(“Welcome activity”)
22. Layouti za sve aktivnosti su proizvoljni
23. Boje za sve aktivnosti su proizvoljne (boje trebaju biti iste kroz čitavu aplikaciju). <br>
 
## Preview 
 <img src="https://user-images.githubusercontent.com/59321839/125001330-a4196580-e052-11eb-87b6-075d5b9be9d1.gif"  width="350" height="650">

