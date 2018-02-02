
a="4.1.6 Using the Rectangle Class"
b="4.1.7 Calling A Method"
c="4.1.8 Using the Point Class"
d="4.1.9 Using the Student Class"
e="4.2.5 Text Messages"
f="4.3.5 Coin Flips"
g="4.3.6 Longest Streak"
h="4.3.8 How Far Away is"
i="4.4.5 Triangle Class- Constructor"
j="4.4.8 toString for Flowers"
k="4.4.9 Instance Variables for Your Dog"
l="4.4.10 Student GPA Field"
m="4.4.12 Pizza Time"
n="4.4.13 Fractions"
o="4.5.5 Writing getPerimeter"
p="4.5.6 Honors Students"
q="4.5.7 The Full Triangle Class"
r="4.5.8 Battle Average"
s="4.5.9 Distance in Kilometers"
t="4.6.5 Text Messages Getter Methods"
u="4.6.6 Fractions Getter/Setter Methods"
v="4.6.7 Full Fraction Class"
w="4.7.7 The Unit Circle"
x="4.7.8 How Many Players in the Game"
y="4.7.9 Circle Area - another way"
z="4.7.10 Rock Paper Scissors - get"

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
	11:k,
	12:l,
	13:m,
	14:n,
	15:o,
	16:p,
	17:q, 
	18:r,
	19:s,
	20:t,
	21:u,
	22:v,
	23:w,
	24:x,
	25:y,
	26:z}


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