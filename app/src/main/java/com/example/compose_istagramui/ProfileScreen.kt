package com.example.compose_istagramui

import android.content.ClipDescription
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//modifiler obyekti kop xil xususyatlarni oz ichiga oladi va bu xususyatlar kompanentalarning tarkibiy xusuyatlarini tahrirlashga noljallangan
@ExperimentalFoundationApi
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier.fillMaxSize()
) {

    var selecTabIndex by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TopBar()
        ProfileSection()
        ProfileDescription(
            name = "Programming mentor",
            description = "10 years of coding experience" +
                    "Want me to make your app? Send me an email" +
                    "Android tutorials? Subscribe to my channel!",
            "https://youtube.com/c/PhilippLackner"
        )
        Spacer(modifier = Modifier.height(10.dp))
        ButtonSection(
            list = listOf(
                TextWithImage(
                    image = Icons.Default.KeyboardArrowDown,
                    text = "following"
                ),
                TextWithImage(
                    image = null,
                    text = "message"
                ),
                TextWithImage(
                    image = null,
                    text = "email"
                ),
                TextWithImage(
                    image = Icons.Default.KeyboardArrowDown,
                    text = null
                )
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        HighlightedSelection(
            list = listOf(
                Story(painterResource(id = R.drawable.jahon1), "You Tube"),
                Story(painterResource(id = R.drawable.jahon2), "Instagram"),
                Story(painterResource(id = R.drawable.jahon3), "Jahongir"),
                Story(painterResource(id = R.drawable.jahon4), "salom")
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        TabRowLayout(
            imageWithTexts = listOf(
                Story(image = painterResource(id = R.drawable.ic_grid), name = ""),
                Story(image = painterResource(id = R.drawable.ic_screen), name = ""),
                Story(image = painterResource(id = R.drawable.ic_assistant), name = ""),
                Story(image = painterResource(id = R.drawable.ic_baseline_work_24), name = "")
            ),
            onTabSelected = {
                selecTabIndex = it
            }
        )
        when (selecTabIndex) {
            0 -> Posts(
                posts = listOf(
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                    painterResource(id = R.drawable.jahon3),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                ),
                modifier = Modifier.fillMaxWidth()
            )
            1 -> Posts(
                posts = listOf(
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon3),
                    painterResource(id = R.drawable.jahon2),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                ),
                modifier = Modifier.fillMaxWidth()
            )
            2 -> Posts(
                posts = listOf(
                    painterResource(id = R.drawable.jahon3),
                    painterResource(id = R.drawable.jahon2),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                ),
                modifier = Modifier.fillMaxWidth()
            )
            3 -> Posts(
                posts = listOf(
                    painterResource(id = R.drawable.jahon3),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon4),
                    painterResource(id = R.drawable.jahon1),
                    painterResource(id = R.drawable.jahon2),
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
//toolbar
@Composable
fun TopBar(
    modifier: Modifier = Modifier
        .fillMaxWidth()   //bu digani width match paren digani
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,//bu digani hammasi bir hil masofada qochadi
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
        )
        Text(
            text = "philipplackner_official",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
        )
        Icon(
            painterResource(id = R.drawable.ic_notifications),
            null,
            modifier = Modifier
                .size(30.dp)
        )
        Icon(
            painterResource(id = R.drawable.ic_more),
            null,
            modifier = Modifier
                .size(30.dp)
        )
    }
}
// storini rasmi va followlar
@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Row(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.story),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .aspectRatio(1f)
                .border(
                    width = 2.dp,
                    shape = CircleShape,
                    color = Color.Gray
                )
                .clip(CircleShape)
        )
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "601", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.Black)
            Text(text = "Posts", fontSize = 20.sp, color = Color.Black)
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "99.8k",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
            Text(text = "followers", fontSize = 20.sp, color = Color.Black)
        }
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "72", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.Black)
            Text(text = "following", fontSize = 20.sp, color = Color.Black)
        }
    }
}
//malumotlari
@Composable
fun ProfileDescription(
    name: String,
    description: String,
    url: String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            description,
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            url,
            fontSize = 18.sp,
            color = Color(0xFF3d3d91)
        )
        Text(text = buildAnnotatedString {
            val buildStyle = SpanStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            append("Followed by")
            pushStyle(buildStyle)
            append("codingflow,miakhalifa")
            pop()
            append("and")
            pushStyle(buildStyle)
            append("17 and others")
        })

    }
}
//email message va hokazo
@Composable
fun ButtonSection(
    list: List<TextWithImage>,
    modifier: Modifier = Modifier

) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            list.forEachIndexed { index, textWithImage ->
                ActionButton(textWithImage = textWithImage)
            }
        }
    }
}
//email message itemi
@Composable
fun ActionButton(
    textWithImage: TextWithImage,
    modifier: Modifier = Modifier
        .padding(10.dp)
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .border(
                width = 2.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(18.dp)
            )
            .padding(horizontal = 8.dp, vertical = 5.dp)
    ) {
        if (textWithImage.text != null) {
            Text(
                text = textWithImage.text ?: "",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        if (textWithImage.image != null) {
            Icon(imageVector = textWithImage.image, contentDescription = null)
        }
    }
}
//estaqolarli storylar
@Composable
fun HighlightedSelection(
    list: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        items(list.size) {
            StoryItem(story = list[it])
        }
    }
}
//esta qolarli storylarni itemi
@Composable
fun StoryItem(
    story: Story,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = story.image,
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .aspectRatio(1f)
                .border(
                    width = 2.dp,
                    shape = CircleShape,
                    color = Color.Gray
                )
                .clip(CircleShape)
        )
        Text(text = story.name, fontSize = 20.sp, color = Color.Black)
    }
}
//tabLayout
@Composable
fun TabRowLayout(
    modifier: Modifier = Modifier,
    imageWithTexts: List<Story>,
    onTabSelected: (selectedIndex: Int) -> Unit
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xFF777777)
    TabRow(
        selectedTabIndex = selectedTabIndex,
        backgroundColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = modifier
    ) {
        imageWithTexts.forEachIndexed { index, item ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }
            ) {
                Icon(
                    painter = item.image,
                    contentDescription = item.name,
                    tint = if(selectedTabIndex == index) Color.Black else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )
            }
        }
    }
}
//tablayoutni ichidagi rasmlar
@ExperimentalFoundationApi
@Composable
fun Posts(
    posts: List<Painter>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        modifier = modifier
            .scale(1.01f)
    ) {
        items(posts.size) {
            Image(
                painter = posts[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1f)
                    .border(
                        width = 1.dp,
                        color = Color.White
                    )
            )
        }
    }
}
