class Livro:
    def calcular_preco_total(self, preco, quantidade):
        return preco * quantidade

book1 = Livro()
book1.nome = 'Scratch Book'
book1.preco = 99
book1.quantidade = 3

book2 = Livro()
book2.nome = '36 Lessons of Vivec'
book2.preco = 123
book2.quantidade = 2

print(book1.calcular_preco_total(book1.preco, book1.quantidade))
print(book2.calcular_preco_total(book2.preco, book2.quantidade))
