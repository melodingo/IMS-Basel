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

# Funktion zum Hinzufügen eines neuen Wortes zum Wörterbuch
def neues_wort_hinzufuegen(franzoesisch, deutsch):
    woerterbuch[franzoesisch] = deutsch

# Benutzer kann neue Wörter hinzufügen
while True:
    franz_word = input("Geben Sie das französische Wort ein (oder 'q!' zum Beenden): ").strip()
    if franz_word == 'q!':
        break
    deutsch_word = input("Geben Sie das deutsche Wort ein: ").strip()
    neues_wort_hinzufuegen(franz_word, deutsch_word)

# Anzeige des aktualisierten Wörterbuchs
print("\nAktualisiertes Wörterbuch:")
for fr, de in woerterbuch.items():
    print(f"{fr:<10}: {de:<10}")
