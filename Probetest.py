T= 15.99
P= 24.99
J= 39.99

TShirt = int(input("wie viele T-shirts?"))
Pulli = int(input("Wie viele Pullover?"))
Jacke = int(input("wie viele jacken?"))

X = TShirt * T
Y = Pulli * P 
Z = Jacke * J

Total= X + Y + Z
print("Ohne Portokosten: " + str(Total))

if Total <= 50:
    Port = Total + 13.95
    print ("Portokosten: 13.95")
    print ("Total Mit Portokosten: " + str(Port))
    
elif Total >= 50 and Total <=100:
    Port2 = Total + 4.95
    print ("Portokosten: 4.95")
    print ("Total Mit Portokosten: " + str(Port2))
    
elif Total >= 100:
    print ("Portokosten: Keine")
    print ("Total Mit Portokosten: " + str(Total))
