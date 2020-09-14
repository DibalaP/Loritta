package net.perfectdreams.loritta.platform.twitter

import java.io.File

object LorittaTwitterLauncher {
    @JvmStatic
    fun main(args: Array<String>) {
        val dummyConfigText = File("dummy.txt").readLines()

        val consumerKey = dummyConfigText[0]
        val consumerSecret = dummyConfigText[1]
        val accessToken = dummyConfigText[2]
        val accessTokenSecret = dummyConfigText[3]
        val pluginsFolder = dummyConfigText[4]
        val assetsFolder = dummyConfigText[5]

        val twitter = LorittaTwitter()
        twitter.start()
    }
}