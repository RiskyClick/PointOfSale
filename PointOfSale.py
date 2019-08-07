import pygame

pygame.init()
screen = pygame.display.set_mode((1000, 750))
done = False
color = (0, 128, 255)
clock = pygame.time.Clock()
maps = True
booze = False
food = False

def button(msg,x,y,w,h,col):
    global maps, food, booze
    font = pygame.font.SysFont('Arial', 25)
    mouse = pygame.mouse.get_pos()
    click = pygame.mouse.get_pressed()
    if x + w > mouse[0] > x and y + h > mouse[1] > y and click[0] == 1:
        if msg == "Map":
            maps = True
            booze = False
            food = False
        elif msg == "Booze":
            maps = False
            booze = True
            food = False
        elif msg == "Food":
            maps = False
            booze = False
            food = True
        else:
            maps = False
            booze = True
            food = False
    pygame.draw.rect(screen, col,(x,y,w,h))
    screen.blit(font.render(msg, True, (0,0,0)), (x + 25, y + 10))
    
def mapsScreen():
    button("Bar 1",150,450,100,50,color)
    button("Bar 2",255,450,100,50,color)
    button("Bar 3",360,450,100,50,color)
    button("Bar 4",465,450,100,50,color)
    button("Bar 5",570,450,100,50,color)

def boozeScreen():
    button("Beer",150,450,100,50,color)
    button("Wine",255,450,100,50,color)
    button("courage",360,450,100,50,color)
    button("Food",465,450,100,50,color)
    button("Map",570,450,100,50,color)


def foodScreen():
    button("Pizza",150,450,100,50,color)
    button("Burger",255,450,100,50,color)
    button("Pasta",360,450,100,50,color)
    button("Booze",465,450,100,50,color)
    button("Map",570,450,100,50,color)
    
while not done:
    if maps:
        mapsScreen()

    elif booze:
        boozeScreen()

    elif food:
        foodScreen()
        
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            quit()
        
    pygame.display.flip()
