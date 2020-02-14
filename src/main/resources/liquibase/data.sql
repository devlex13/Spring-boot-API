INSERT INTO public.teachers (id, name, surname, photo) VALUES
  (1, 'Alexander', 'Echavarria', 'https://image.freepik.com/foto-gratis/chico-profesional-positivo-ropa-formal-chateando-movil-gesticulando-mientras-usa-telefono-celular-aislado-gris_171337-636.jpg'),
  (2, 'Gonzalo', 'Fuentes', 'https://fashiop.com/blog/wp-content/uploads/2016/04/look-hombre-boda-de-noche-con-pajarita-fashiop.jpg'),
  (3, 'Natalia', 'Jimenez', 'https://st.depositphotos.com/1224365/2485/i/450/depositphotos_24858377-stock-photo-close-up-of-a-normal.jpg'),
  (4, 'Samuel', 'García', 'https://www.okchicas.com/wp-content/uploads/2015/06/Cortes-de-cabello-para-hombre-31.jpg');


INSERT INTO public.courses (id, active, teacher, title, level, hours) VALUES
  (1, true, 1, 'Java 01', 'Basico', 25),
  (2, true, 2, 'Java 02', 'Basico', 22),
  (3, true, 3, 'Java 03', 'Intermedio', 23),
  (4, true, 4, 'Java 04', 'Dificil', 30);
