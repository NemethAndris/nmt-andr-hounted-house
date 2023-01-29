# Haunted House

Ebben a feladatban egy kísértet kastély működését próbáltam megírni. Jönnek vendégek és a házban lévő szörnyek közül sorra megijeszti őket random valamelyik. Ha egy vendég már túlságosan fél akkor haza szalad.
Sajnos nagyon sietnem kellett és több SOLID elvet is megszegtem. Írd át nekem kérlek, hogy szebb legyen. Például az encapsulation-t ne törje meg. És az enum se mutat túl jól, azt teljesen kivezethetnéd. Hogyan lehetne szétszedni?
Az ijesztési ciklus implementálásának sem jutottam a végére. Ott tartok vele, hogy valószínűleg a removeIf függvény jól jön majd hozzá.

# Osztályok

- BaseMonster:  `scare()` függvény, `boolean` visszatérési értékkel
- Guest: energyLevel, healthLevel, scaredLevel, name változók, mind getter-rel és egy konstruktorral ami bekéri a vendég nevét. `isTooScared()` függvény `boolean` visszatérési értékkel, ami megmondja elszalad e a vendég
Ijedttségi határok: scaredLevel > 100 , energyLevel < 25 , healthLevel < 4. Ha bármelyik igaz, távolítsd el a kastélyból a vendéget.
- HauntedHouse: guestList, monsterList, Random generáló. A listákhoz getter írása szükséges
Szörnyek a következő típusokban kell hogy elérhetőek legyenek:
- Vampire: Nagyon ijesztő. Levon 40-et a vendég energyLevel-éből.
- Demon: Nagyon ijesztő. Levon 10-et a vendég healthLevel-jéből és hozzáad 7-et a scaredLevel-hez.
- Ghost: Nagyon ijesztő. Hozzáad 33-at a vendég scaredLevel-jéhez.
