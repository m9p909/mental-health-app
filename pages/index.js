import Head from 'next/head'
import Image from 'next/image'
import {Container, Navbar} from 'react-bootstrap'
import styles from '../styles/Home.module.css'


export default function Home() {
  return (
	<>
	  <Navbar>
	  	<Container>
	  <Navbar.Brand>
	  Mental Health Tracker
	  </Navbar.Brand>
	  </Container>
	  </Navbar>
	</>
  )
}
