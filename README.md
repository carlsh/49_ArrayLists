# 49_ArrayLists

Kanban boards skal opdateres.

Brug af `ArrayList<>` med diverse metoder p. 694
`ArrayList<E> minArrayList = new ArrayList<E>()`
E er elementtypen, f.eks. String, Integer eller en klasse

Nyttige metoder:
`
.size()
.get(i);
.set(i, E);
.remove(i);
.indexOf(E); //finder plads i arraylisten med E`

Normal iteration
`for (int i=0;i<list.size();i++)`

Kan erstattes med for each
`for (E s : minArrayList)`

Når der fjernes og tilføjes virker det ikke altid som forventet.
Skal der tilføjes/fjernes hvert andet, så kør for løkken baglæns.
Ex. p. 701 - 702.

## Opgaver
Exercises p. 737
2, 3, 6, 8
