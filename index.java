*{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    list-style: none;
    text-decoration: none;
}
:root{
    --bg-color:#0c0c0c;
    --text-color:#fff;
    --main-color: #ae8957;

    --big-font:6.6rem;
    --p-font:1rem;

}
body{
    background:var(--bg-color);
    color: var(--text-color);

}
/* header */
header{
    position: fixed;
    width: 100%;
    top:0;
    right: 0;
    z-index: 1000;
    padding: 35px 7%;
    display: flex;
    align-items: center;
    justify-content: space-between;
    transition: all.50s ease;
} 
.logo img{
    width: 100%;
    height: auto;
}
.navlist{
    display: flex;
}
.navlist a{
    display: inline-block;
    margin :0 35px;
    color: var(--text-color);
    font-size: var(--p-font);
    transition: all .6s ease;

}
.navlist a:hover{
    color: var(--main-color);
}
.right-content{
    display: flex;
    align-items: center;
}
.nav-btn{
display: inline-block;
padding: 9px 24px;
background:transparent;
border: 2px solid var(--text-color);
border-radius: 7px;
color: var(--text-color);
font-size: 15px;
font-weight: 500;
transition: all .6s ease;
}
.nav-btn:hover{
    transform: translateY(-5px);
    border:2px solid var(--main-color);
    color:var(--main-color);
}
#menu-icon{
    font-size:42px;
    z-index: index 10001;
    cursor: pointer;
    margin-left:25px;
    display:none;
}
.section{
    padding: 0 14%;
}
.hero{
    position: relative;
    width:100%;
    height: 100vh;
    background: url(hero-bg.jpg);
    background-size: cover;
    background-position: center;
    display: grid;
    grid-template-columns:repeat(2, 1fr);
    align-items: center;
    gap:2rem;
}
.hero-img img{
    width: 100%;
    height: auto;
}
.hero-text h1{
    font-size: var(--big-font);
    font-weight: 700;
    margin: 20px 0;
}
.hero-text h5{
    font-size: 18px;
    font-weight: 400;
    letter-spacing: 1px;
}
.hero-text p{
    width: 100%;
    max-width: 620px;
    font-size: var(--p-font);
    font-weight: 400;
    line-height: 32px;
    color: var(--text-color);
    margin-bottom: 40px;
}
.main-hero{
    display: flex;
    align-items: center;
}
.btn{
    display: inline-block;
    padding: 13px 32px;
    background: var(--main-color);
    border: 2px solid transparent;
    border-radius: 7px;
    color: var(--text-color);
    font-size: 15px;
    font-weight: 500;
    transition: all .6s ease;
}
.btn:hover{
    transform: scale(1.1);
}
.price{
    display: flex;
    align-items: center;
    font-size: 28px;
    font-weight: bold;
    color: var(--text-color);
}
.price span{
    font-size: 17px;
    font-weight: 400;
    color: var(--main-color);
    margin-left: 10px;
}
.icons{
    position: absolute;
    top: 50%;
    padding: 0.7px;
    transform: translateY(-50%);
}
.icons i{
    display: block;
    margin: 35px 0;
    color: var(--text-color);
    font-size: 23px;
    transition: all .6s;
}
.icons i:hover{
    transform: translateY(-5px);
    color: var(--main-color);
}
.scroll{
    position: absolute;
    top: 92%;
    right: 7%;
    transform: translateY(-50%);
}
.scroll a{
    font-size: 16px;
    color: var(--text-color);
}
.scroll i{
    font-size: 20px;
    color: var(--text-color);
    margin-right: 6px;
}
@media(max-width:1770px){
    header{
        padding: 22px 4%;
    }
    .icons{
        padding: 0 4%;
    }
    .scroll{
        right:4%;
    }
}
@media(max-width:167px){
    :root{
        --big-font: 5.5rem;
        --p-font:15px;
    }
    }
@media(max-width:1370px){
    .icons{
        display: none;
    }
    section{
        padding: 0 4%;

    }
    }
 @media(max-width:1150px){
        :root{
            --big-font:4.6rem;
        }
        .price{
            font-size: 20px;
        }
        .btn{
            padding:10px 23px;
        }
        }
        @media(max-width:950px){
            #menu-icon{
                display: block;
            }
            .navlist{
                position: absolute;
                width: 100%;
                height: 100