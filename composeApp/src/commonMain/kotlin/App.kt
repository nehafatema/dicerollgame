import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import dicerollergame.composeapp.generated.resources.Res
import dicerollergame.composeapp.generated.resources.dice_1
import dicerollergame.composeapp.generated.resources.dice_2
import dicerollergame.composeapp.generated.resources.dice_3
import dicerollergame.composeapp.generated.resources.dice_4
import dicerollergame.composeapp.generated.resources.dice_5
import dicerollergame.composeapp.generated.resources.dice_6
import dicerollergame.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.DrawableResource
import kotlin.random.Random

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var image: DrawableResource by remember { mutableStateOf(Res.drawable.dice_1) }
        Column {
            Text(text = "Welcome in Dice Roller Game")
            Image(painterResource(image),contentDescription = null)
            Button(onClick = ({
                var random=Random.nextInt(6)+1
                when(random){
                    1 -> image = Res.drawable.dice_1
                    2 -> image = Res.drawable.dice_2
                    3 -> image = Res.drawable.dice_3
                    4 -> image = Res.drawable.dice_4
                    5 -> image = Res.drawable.dice_5
                    6 -> image = Res.drawable.dice_6
                    else -> Res.drawable.compose_multiplatform
                }
            })){
                Text(text = "Roll Image")
            }
        }
    }
}