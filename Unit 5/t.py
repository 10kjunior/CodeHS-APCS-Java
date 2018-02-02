
a="5.2.6 Our First Array"
b="5.2.7 Array Length"
c="5.2.8 Last Element in Array"
d="5.3.6 Print Array"
e="5.3.7 Print Odd Array Indices"
f="5.3.8 Find the Minimum Index"
g="5.3.12 Find the Median"
h="5.3.13 Top Student"
i="5.4.6 Get First Element"
j="5.4.9 Road Trip"


nameL = {1:a,
	2:b,
	3:c,
	4:d,
	5:e,
	6:f,
	7:g,
	8:h,
	9:i,
	10:j,
	}


for i in range(22):
	x = nameL[i+1]
	f= open(x+".java","w+")
	f.write("/*---------------------------------------------------------*|\n")
	f.write("|                Created by Tannre Overly - 2018            |\n")
	f.write("|-----------------------------------------------------------|\n")
	f.write("|   WARNING -   WARNING -   WARNING -   WARNING -   WARNING |\n")
	f.write("|-----------------------------------------------------------|\n")
	f.write("|   It is highly recommended that you attempt to solve your |\n")
	f.write("| problems before using work provided here in order to      |\n")
	f.write("| actually learn from your mistakes. Try to use this only to|\n")
	f.write("| review or compare your own work.                          |\n")
	f.write("|_______________________Good_Luck___________________________|*/\n\n")
	f.close()