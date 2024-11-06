# Wörterbuch mit den gegebenen Informationen
woerterbuch = {
    "Livre": "Buch",
    "Pomme": "Apfel",
    "Oiseau": "Vogel",
    "Maison": "Haus",
    "Chien": "Hund",
    "Champs": "Feld",
    "Potier": "Töpfer"
}

# Liste aller französischen Wörter
franzoesisch = list(woerterbuch.keys())
print("Französische Wörter:")
print(franzoesisch)

# Liste aller deutschen Wörter
deutsch = list(woerterbuch.values())
print("\nDeutsche Wörter:")
print(deutsch)

# Benutzereingabe
suchwort = input("\nGeben Sie ein französisches Wort oder einen Teil davon ein: ").strip().lower()

# Suchen und Anzeigen der passenden Wörter
print("\nPassende Wörter:")
for fr, de in woerterbuch.items():
    if suchwort in fr.lower():
        print(f"{fr:<10}: {de:<10}")
