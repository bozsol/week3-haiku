#Haiku_1.0

Hozz létre egy három rétegű alkalmazást, amely képes haiku-t költeni!
(Japán versforma. Három soros, az első és a harmadik sor 5 szótagból áll, a második 7-ből.)

1.
A Repository-ban legyen három kollekció, melyek különböző szótagszámú (1, 2, 3) szavakat tárolnak.
Legyenek a következő beégetett kezdeti értékek:
1 szótagú szavak:
life,love,world,me,day,one,heart,home,man,end,king,sky,death,time,tree,soul,pain,rain,flame
2 szótagú szavak:
perfect,princess,water,people,future,happy,freedom,thousand,nature,city,father,monster,river,
nothing,broken,children,mountain,journey,secret,mother,fire
3 szótagú szavak:
family,happiness,animal,adventure,dangerous,harmony,melody,perfection,tomorrow,medicine,
funeral,innocent,different,paradise,accident,fantasy,character,afterlife,confusion,abstinence

2.
Hozz létre a projektben egy haiku.http fájlt, amelyben lesz majd egy get, egy post és egy delete kérés.

3.
Get kérés esetén kapjunk vissza egy haikut a listákban szereplő szavakat használva.
A logika egymás utána rakja össze a sorokat (5-7-5 szótag) oly módon,
hogy véletlenszerűen kivesz egy szót egy olyan listából, amelyik szótagszáma még belefér az adott sorba.

Példa:
Első random szám (1-3 között) a 2.
Tehát kiveszek az egy (random!) elemet a kettes listából, és azt fűzöm hozzá az első sorhoz.
Ezekután tudom, hogy még három szótag fér el az első sorba,
így megint mind a három lista közül választok egyet.
Második random szám ismét a 2, tehát megint abból a listából jön egy érték.
Majd tudjuk, hogy már csak egy szótagnak van hely, így fixen abból a listából választok.

4.
Írj a Controllerbe egy MockMvc-s tesztet!

5.
Legyen Docker-ben futtatható az alkalmazás!

--------------------------

6.
Ha elküldünk egy post kérésben egy szót, az kerüljön letárolásra a megfelelő szótagszámú listába.
Amennyiben ez a szó már szerepel a listában, adjon vissza egy hibaüzenetet.

7.
Ha delete kérésben küldünk el egy szót, akkor az törlődjön a megfelelő listából.
Amennyiben ez a szó nem szerepel a listában, adjon vissza egy hibaüzenetet.