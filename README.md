# G3TB-Modding
Gothic 3 The Beginning Modding Info Summary

This is a summary of all infos gained during exploring the Gothic 3 TB files.

>If you have any information that are not listed here, feel free to add them.

![](files/cover.png)

# Content of this repo

### **images**
Contains all the extracted images

### **jars**
Contains a lot of j2me jars of the game in different languages

### **music**
The game music from the game converted to mp3

### **source**
The game source code decompiled from different decompilers

### **jd-gui.zip**
The jd-gui tool to decompile and browse .jar and .class files

# File Types

## **.class**
Description of the five java/class files:

<details>
  <summary>Show class files</summary>

- A.class
  - Still unknown, feel free to contribute your knowledge here
- B.class
  - Still unknown, feel free to contribute your knowledge here
- C.class
  - Still unknown, feel free to contribute your knowledge here
- D.class
  - Still unknown, feel free to contribute your knowledge here
- HG.class
  - Still unknown, feel free to contribute your knowledge here
</details>

## **.mid**
The game music in midi file format

## **.amr**
Still unknown, feel free to contribute your knowledge here

## **.mdl**
Still unknown, feel free to contribute your knowledge here

## **a**
Still unknown, feel free to contribute your knowledge here

## **b**
Still unknown, feel free to contribute your knowledge here

## **c**
Still unknown, feel free to contribute your knowledge here

## **d**
Contains item informations for weapons, armor etc.
The structure is not fully known, feel free to contribute your knowledge here

<details>
  <summary>Notes:</summary>

  ```
  That's should be all the armors.
  They are lined up and I think I've deciphered everything now.
  I'm not sure about the name with the "?" symbol.
  Both robes have a "1E" in the center.
  Do robes have a special property added there?
  Perhaps 64 is the type armor and only the last 2 digits represent the icon.
  ```

</details>

<details>
  <summary>Armors list:</summary>

**Armor**
```
Offsets for armors are from 1369(incl.) to 1443(excl.)

Light diggers trousers (Offset: 1369)
0000
16		ID
00
00		Strength needed 5
05		Prot Weapons 5
00		Prot Arrows 0
00
00 0A	Value 10
00 00 
64 0D 	Icon
00 00 16 00 00 05 00 00 00 0A 00 00 64 0D

Diggers trousers (Offset: 1377)
00 00
11		ID
00		
05 		Strength needed 5
0A 		Prot Weapons 10
00 		Prot Arrows 0
00
00 1E 	Value 30
00
00
64 0D 	Icon
00 00 11 00 05 0A 00 00 00 1E 00 00 64 0D

Robe (Offset: 1385)
00 00
1B		ID
00		
05		Strength needed 5
0A		Prot Weapons 10
05		Prot Arrows 5
1e		Robe indicator?
00 64	Value 100
00
00
64 0E	Icon
00 00 1B 00 05 0A 05 1E 00 64 00 00 64 0E

Light leather armour (Offset 1393)
00 00
17		ID
00		
0A 		Strength needed 10
0F 		Prot Weapons 15
05 		Prot Arrows 5
00
00 50 	Value 80
00
00
64 27 	Icon
00 00 17 00 0A 0F 05 00 00 50

Leather armour (Offset: 139D)
00 00
14		ID
00		
14 		Strength needed 20
14 		Prot Weapons 20
0A 		Prot Arrows 10
00
00 96 	Value 150
00
00
64 27 	Icon
00 00 64 27 00 00 14 00 14 14 0A 00 00 96 00 00 64 27

Light chain mail (Offset: 13AF)
00 00 
15 		ID
00
1E		Strength needed 30
1E 		Prot Weapons 30
14		Prot Arrows 20
00
01 5E 	Value 350
00 00
64 0F 	Icon
00 00 15 00 1E 1E 14 00 01 5E 00 00 64 0F

Chain mail (Offset: 13BD)
00 00 
0F		ID
00
28 		Strength needed 40
32 		Prot Weapons 50
28 		Prot Arrows 40
00
02 94 	Value 660
00
00
640F 	Icon
00 00 0F 00 28 32 28 00 02 94 00 00 64 0F

Light plate mail (Offset: 13CB)
00 00 
18 		ID
00
37 		Strength needed 55
3C 		Prot Weapons 60
3C 		Prot Arrows 60
00
041A 	Value 1050
00
00
6410 	Icon
00 00 18 00 37 3C 3C 00 04 1A 00 00 64 10

Plate mail (Offset: 13D9)
00 00 
1A 		ID
00
41 		Strength needed 65
46 		Prot Weapons 70
50 		Prot Arrows 80
00
06 F4 	Value 1780
00
00
6410 	Icon
00 00 1A 00 41 46 50 00 06 F4 00 00 64 10

Ore Armor? (Offset: 13E7)
00 00 
19 		ID
00
4B		75
50 		80
5A		90
28		40
09 C4 	Value 2500
00
00
64 10	Icon (Plate mail)
00 00 19 00 4B 50 5A 28 09 C4 00 00 64 10


Jesbar's mail shirt (Offset: 13F5)
00 00 
13 		ID
00
14 		Strength needed 20
28 		Prot Weapons 40
1E 		Prot Arrows 30
00
05DC 	Value 1500
02		2 Bonuses
02		Bonus Health
0A 		+10
05 		Bonus Dex
05 		+5
00
640F 	Icon
00 00 13 00 14 28 1E 00 05 DC 02 02 0A 05 05 00 64 0F

Dusaro's Robe? (Offset: 1407)
00 00 
12 		ID
00
0F		Strength needed 15
14		Prot Weapons 20
0A		Prot Arrows 10
1E		Robe indicator?
11 94 	Value 4500
03		3 Bonuses
0A		Bonus Prot Weapons
1E		+30
0B		Bonus Prot Arrows
28		+40
03		Bonus Mana
28 		+40
00 		
64 0E 	Icon (same as Robe)
00 00 12 00 0F 14 0A 1E 11 94 03 0A 1E 0B 28 03 28 00 64 0E

Corgar's Armor (Offset: 141B)
00 00 
10 		ID
00
4B 		Strength needed 75
46		Prot Weapons 70
50		Prot Arrows 80
00
0E C4	3780
03		3 Bonuses
02		Bonus Health
32		+50
04 		Bonus Strength
0A		+10
05 		Bonus Dex
05 		+5
00
64 10	Icon (same as Plate mail)
00 00 10 00 4B 46 50 00 0E C4 03 02 32 04 0A 05 05 00 64 10
 
Admiral's Leather armour (Offset: 142F)
00 00 
0E 		ID
00
14		Strength needed 20
14		Prot Weapons 20
0A		Prot Arrows 10
00
0D A2	Value 3490
03 		3 Bonuses
0A		Bonus Prot Weapons
28		+40
0B 		Bonus Prot Arrows
32		+50
02		Bonus Health
32		+50
00
64 27	Icon (same as Leather armour)
00 00 0E 00 14 14 0A 00 0D A2 03 0A 28 0B 32 02 32 00 64 27
```

**Weapons**
```
Knife (Offset and order of bytes unknown)
?? type one-handed weapon
05 Strength needed 5
0F Max Dmg 15
0C Min Dmg 12
38 Hit Chance 56
64 Speed 100
0A Range 10
08 Critical hit 8
???? Icon
```

**Copy me to add new item types if you found some**
```
Still unknown, feel free to contribute your knowledge here
```
</details>

## **f**
Still unknown, feel free to contribute your knowledge here

## **i**
Contains the charset (text characters) used in the game and all the images (png format)

A tool for extracting and packing them back is available here: [G3TB-PngPacker](https://github.com/RednibCoding/G3TB-PngPacker)

## **.ldf**
Still unknown, feel free to contribute your knowledge here

## **.lng**
Contains all the dialogs and text from the game. The structure is not fully known, feel free to contribute your knowledge here
