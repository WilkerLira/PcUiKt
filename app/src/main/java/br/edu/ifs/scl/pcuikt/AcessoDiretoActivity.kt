package br.edu.ifs.scl.pcuikt

import android.app.Activity
import android.os.Bundle
import android.os.SystemClock.sleep
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import org.jetbrains.anko.imageResource


class AcessoDiretoActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Alterando o título da SupportActionBar
        supportActionBar?.title = getString(R.string.acesso_direto)
    }

    override fun run() {
        // Dorme por CARREGA_IMAGENS_DELAY (ms)
        sleep(CARREGA_IMAGENS_DELAY.toLong())

        // Tenta acessar a UI da thread mãe DIRETAMENTE para carregar as imagens
        altaIv.imageResource = R.drawable.android_verde
        baixaIv.imageResource = R.drawable.android_preto
    }
}
