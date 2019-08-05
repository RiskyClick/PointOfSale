import pygame

pygame.init()
screen = pygame.display.set_mode((1000, 750))
done = False
seats = True
x = 30
y = 50
color = (0, 128, 255)
clock = pygame.time.Clock()

def mapOfBar():
    seat = pygame.draw.circle(screen, color, (x, y), 25)

def menu():
    print("TESTTHE")
    

while not done:
        for event in pygame.event.get():
            print(pygame.mouse.get_pos())
            if event.type == pygame.QUIT:
                one = True
            if event.type == pygame.KEYDOWN and event.key == pygame.K_SPACE:
                seats = False
                menu()
                
        if seats:
            mapOfBar()
        
        pygame.display.flip()
