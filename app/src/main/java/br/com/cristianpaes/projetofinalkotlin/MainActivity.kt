package br.com.cristianpaes.projetofinalkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainMundo: Button = findViewById(R.id.btnMainMundo)
        val btnMainSeries: Button = findViewById(R.id.btnMainSeries)
        val btnMainEsportes: Button = findViewById(R.id.btnMainEsportes)
        val btnMainAnimal: Button = findViewById(R.id.btnMainAnimal)
        val btnMainReligiao: Button = findViewById(R.id.btnMainReligiao)

        btnMainMundo.setOnClickListener {

            val listaMundo = arrayListOf("Cerca de 2/3 dos habitantes da Terra nunca viram neve na vida",
                    "O único planeta do Sistema Solar que não tem nome de um deus, é o nosso.", "No topo do famoso Monte Everest, existe uma cobertura para automóveis.",
                    "Todas as pessoas que têm olhos azuis têm um mesmo ancestral em comum.", "Em média, cada pessoa perde 4kg de pele morta em um ano")

            val alert = AlertDialog.Builder(this)
                    .setTitle("Curiosidade Mundo") // Ajustando o título
                    .setMessage(listaMundo.random()) // Ajustando a mensagem
                    .setPositiveButton("Miaw! Incrível") { _, _ ->
                    }
                    .setNeutralButton(" ") { _, _ ->

                    }.setCancelable(true)
            alert.show()
        }
        btnMainSeries.setOnClickListener {

            val listaSeries = arrayListOf("Stephen King muitas vezes dá aos personagens de seus livros nomes de pessoas que ele conhece. No caso de \"À Espera de um Milagre\" ele usou o nome de um professor de história da universidade em que estudou. Além disso, as iniciais de J.C. (John Coffey) correspondem às iniciais de Jesus Cristo. Ao prestar atenção a esse fato, notamos que os criadores do filme adicionaram cenas semelhantes a essa da foto. (A espera de um Milgre)",
                    "Enquanto Gandalf lê os pergaminhos, as velas ao lado dele se derretem, mostrando ao espectador quanto tempo o mago passou procurando a informação necessária. Para alguns, isso pode parecer insignificante, mas, é a partir desses pequenos detalhes que é criado um efeito no filme. (O Hobbit)",
                    " Quando os Sith usam seu método para salvar a vida de Darth Vader, vemos uma sala de operação, e sua forma lembra o símbolo do Império Galáctico.")

            val alert = AlertDialog.Builder(this)
                    .setTitle("Curiosidade Séries e filmes")
                    .setMessage(listaSeries.random())
                    .setPositiveButton("Miaw! Incrível!!!") { _, _ ->
                    }
                    .setNeutralButton(" ") { _, _ ->

                    }.setCancelable(true)
            alert.show()
        }
        btnMainEsportes.setOnClickListener {

            val listaEsportes = arrayListOf("O Brasil e o único país que esteve presente em todas as edições da Copa do Mundo. O evento existe desde 1930 e, desde o início, nenhum outro país esteve em todas as edições. Seja por não se classificarem, ou por outras razões, como políticas, outras nações têm, pelo menos, uma falta.",
                    "Este bizarro e triste caso aconteceu em 1998. Um jogo na República Democrática do Congo acabou de forma trágica. De um lado do campo, o time Bena Tshadi, do outro, o Basanga.\n" +
                            "Durante o jogo, um raio caiu no campo e todos os 11 jogadores do Bena Tshadi morreram. Mas, do outro lado, todos os 11 do Basanga saíram ilesos. O incidente fez ser discutido até a possibilidade de feitiçaria.",
                    "Essa história era considerada uma lenda. Porém, o próprio Ronaldinho Gaúcho confirmou. Quando era adolescente, com 13 anos, ele marcou 23 gols em uma partida. O jogo terminou em 23 x 0, como todos os tentos marcados por ele.", "" +
                    "Em 1985, na Bélgica, uma verdadeira tragédia no mundo do futebol deixou o caso das brigas de torcida ainda mais polêmico. Torcedores do Liverpool causaram a morte de 39 torcedores da Juventus. No mesmo episódio, 600 pessoas ficaram feridas.\n" +
                    "Os ingleses empurraram os italianos contra um muro, que cedeu e arrastou as pessoas. Como punição, todas os times da Inglaterra foram banidos de torneiros da UEFA, a confederação europeia de futebol, por cinco anos. O Liverpool, por outro lado, ficou seis anos sem competir no continente.")

            val alert = AlertDialog.Builder(this)
                    .setTitle("Curiosidade Esportes")
                    .setMessage(listaEsportes.random())
                    .setPositiveButton("Miaw! Incrível!!!") { _, _ ->
                    }
                    .setNeutralButton(" ") { _, _ ->

                    }.setCancelable(true)
            alert.show()
        }
        btnMainAnimal.setOnClickListener {

            val listaAnimal = arrayListOf("Ursos polares não emitem calor detectável", " Um atum pode nadar até 64 quilômetros em um só dia", "Alguns anfíbios saltam distâncias que correspondem a 100 vezes o seu tamanho", "Ratos também sentem cócegas",
                    "Ratos também sentem cócegas")

            val alert = AlertDialog.Builder(this)
                    .setTitle("Curiosidade Animal")
                    .setMessage(listaAnimal.random())
                    .setPositiveButton("Miaw! Incrível!!!") { _, _ ->
                    }
                    .setNeutralButton(" ") { _, _ ->

                    }.setCancelable(true)
            alert.show()
        }
        btnMainReligiao.setOnClickListener {

            val listaReligiao = arrayListOf("O Candomblé é uma religião original da Nigéria e Benin e eles não acreditam na existência de céu e inferno. Para eles, a alma das pessoas fica vagando entre o céu e a terra até realizarem seu propósito.",
                    "Os budistas acreditam que exitem vários céus e que desde que as pessoas realizem coisas boas ao longo da vida, elas poderão renascer em algum deles. Mas essa morada não é eterna porque as pessoas podem voltar como outros seres.",
                    "Algumas pessoas pensam que a maçonaria é composta apenas por homens, mas existem ordens maçônicas femininas. E na ordem feminina, não é nada diferente do que se vê na ala masculina, os ritos são os mesmos, as vestes e as outras práticas que são comuns da maçonaria.",
                    "No Islamismo, o calendário é 11 dias menor do que o calendário ocidental. Isso acontece porque ele se baseia nas fases da lua e os calendários ocidentais, que é o que nós usamos, têm como base a rotação da Terra ao redor do sol.")

            val alert = AlertDialog.Builder(this)
                    .setTitle("Curiosidade Religião")
                    .setMessage(listaReligiao.random())
                    .setPositiveButton("Miaw! Incrível!!!") { _, _ ->
                    }
                    .setNeutralButton(" ") { _, _ ->

                    }.setCancelable(true)
            alert.show()
        }
    }
}






