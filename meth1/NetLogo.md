HW prompt: Day 1 of Netlogo, how do you want to introduce it? (Might include some guided programming, i.e., look at Model X and do something with it. -- Why did you pick X model?) (edited)

I would utilize the Sunflower (https://ccl.northwestern.edu/netlogo/models/Sunflower) model to demonstrate how NetLogo works. I chose this one because it's simple to understand and update.

There are 3 main variables:
- num-colors
- step-size
- turn-increment

You can also adjust the model speed (ticks) to show the sunflower creating new petals faster or slower. I would first demonstrate the default drawing and then adjust the sliders to change the output, asking students along the way what the sliders do (first hypothesize/predict and then test it out).

After students understand the model, I would show them the code and see if they can make connections between what we're seeing on screen graphically and what is written out in text.

Back pocket questions:
- What is meant by:
to setup
  clear-all
  reset-ticks
end
- What do you think "create-turtles" does?
- How about color, size, and heading ticks?
- What would happen if we took out "ask turtles"?
