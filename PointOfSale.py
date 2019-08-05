import pygame

pygame.init()
screen = pygame.display.set_mode((1000, 750))
done = False
is_blue = True
x = 30
y = 50
color = (0, 128, 255)
clock = pygame.time.Clock()

while not done:
        for event in pygame.event.get():
            print(pygame.mouse.get_pos())
            if event.type == pygame.QUIT:
                one = True

        while x < 1000:
            
            pygame.draw.circle(screen, color, (x, y), 25)
            x += 75

        if x > 1000:
            x = 30
            
        
        pygame.display.flip()
